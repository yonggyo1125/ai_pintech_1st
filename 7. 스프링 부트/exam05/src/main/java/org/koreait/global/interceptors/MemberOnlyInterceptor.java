package org.koreait.global.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.koreait.member.libs.MemberUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
@RequiredArgsConstructor
public class MemberOnlyInterceptor implements HandlerInterceptor {
    private final MemberUtil memberUtil;

    /**
     * 컨트롤러 빈의 요청 메서드 실행 전 호출
     *  - 반환값이 false : 컨트롤러 빈 요청 메서드 실행 X
     *  - 반환값이 논리값인 이유? 화면에 대한 통제
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if (memberUtil.isLogin()) { // 로그인 상태 일때만 마이페이지 노출

            return true;
        }

        // 미 로그인 상태 이면 로그인 페이지 이동, 로그인 완료 후 마이페이지로 자동 이동
        String url = String.format("%s%s?redirectUrl=%s", request.getContextPath(), "/member/login", "/mypage");
        response.sendRedirect(url);

        //return true;
        return false; // 컨트롤로 빈 요청 메서드 실행 X - 화면이 보이지 않음
    }
}
