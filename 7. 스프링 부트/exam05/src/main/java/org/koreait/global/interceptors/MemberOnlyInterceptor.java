package org.koreait.global.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class MemberOnlyInterceptor implements HandlerInterceptor {
    /**
     * 컨트롤러 빈의 요청 메서드 실행 전 호출
     *  - 반환값이 false : 컨트롤러 빈 요청 메서드 실행 X
     *  - 반환값이 논리값인 이유? 화면에 대한 통제
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("preHandle()!");

        //return true;
        return false; // 컨트롤로 빈 요청 메서드 실행 X - 화면이 보이지 않음
    }
}
