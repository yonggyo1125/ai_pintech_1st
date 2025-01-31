package org.koreait.global.advices;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.koreait.global.exceptions.CommonException;
import org.koreait.global.exceptions.scripts.AlertBackException;
import org.koreait.global.exceptions.scripts.AlertException;
import org.koreait.global.exceptions.scripts.AlertRedirectException;
import org.koreait.member.libs.MemberUtil;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

/**
 * org.koreait 패키지를 포함한 하위 패키지의 모든 @Controller 애노테이션 적용된 컨트롤러
 */
@ControllerAdvice(annotations = Controller.class)
@RequiredArgsConstructor
public class CommonControllerAdvice {
    private final MessageSource messageSource;
    private final HttpServletRequest request;
    private final MemberUtil memberUtil;

    /**
     * org.koreait 패키지를 포함한 하위 패키지의 모든 컨트롤러에서 공유할 값
     * @return
     */
    @ModelAttribute("isLogin")
    public boolean isLogin() {
        return memberUtil.isLogin();
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView errorHandler(Exception e, Model model, HttpServletRequest request) {
        e.printStackTrace();

        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR; // 기본 응답 코드 500
        String message = e.getMessage(); // 기본 메세지
        String tpl = "error/errorPage";
        ModelAndView mv = new ModelAndView();

        if (e instanceof CommonException commonException) { // 직접 정의한 예외인 경우 정의한 예외로 대체
            status = commonException.getStatus();
            if (commonException.isErrorCode()) {
                message = messageSource.getMessage(message, null, request.getLocale());
            }
            StringBuffer sb = new StringBuffer(1000);

            if (e instanceof AlertException) {
                sb.append(String.format("alert('%s');", message));

                tpl = "common/_execute_script";
            }

            if (e instanceof AlertBackException alertBackException) {
                String target = alertBackException.getTarget();
                sb.append(String.format("%s.history.back()", target));
            }

            if (e instanceof AlertRedirectException alertRedirectException) {
                String target = alertRedirectException.getTarget();
                String url = alertRedirectException.getUrl();
                sb.append(String.format("%s.location.replace('%s%s')", target, request.getContextPath(), url));
            }

            mv.addObject("script", sb.toString());
        }

        //response.setStatus(status.value());


        mv.setStatus(status);
        mv.addObject("message", message);
        mv.setViewName(tpl);

        return mv;
    }
}
