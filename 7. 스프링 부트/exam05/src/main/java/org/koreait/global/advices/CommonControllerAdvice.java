package org.koreait.global.advices;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.koreait.global.exceptions.CommonException;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * org.koreait 패키지를 포함한 하위 패키지의 모든 @Controller 애노테이션 적용된 컨트롤러
 */
@ControllerAdvice("org.koreait")
@RequiredArgsConstructor
public class CommonControllerAdvice {
    private final MessageSource messageSource;

    @ExceptionHandler(Exception.class)
    public ModelAndView errorHandler(Exception e, Model model, HttpServletRequest request) {
        e.printStackTrace();

        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR; // 기본 응답 코드 500
        String message = e.getMessage(); // 기본 메세지

        if (e instanceof CommonException commonException) { // 직접 정의한 예외인 경우 정의한 예외로 대체
            status = commonException.getStatus();
            if (commonException.isErrorCode()) {
                message = messageSource.getMessage(message, null, request.getLocale());
            }
        }

        //response.setStatus(status.value());

        ModelAndView mv = new ModelAndView();
        mv.setStatus(status);
        mv.addObject("message", message);
        mv.setViewName("error/errorPage");

        return mv;
    }
}
