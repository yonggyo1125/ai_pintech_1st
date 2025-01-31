package org.koreait.filters;

import jakarta.servlet.*;

import java.io.IOException;

public class MyFilter1 implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("MyFilter1 - 요청 전"); // 요청 처리 전 - 요청 데이터 필터링

         // 다음 필터가 있으면 다음 필터로 호출(request, request 객체 전달과 함께)
        // 다음 필터가 없으면 서블릿쪽 정의된 요청 메서드(doGet(..), doPost(..)) 호출
        chain.doFilter(request, response);

        System.out.println("MyFilter1 - 응답 후"); // 응답 후에 필터링
    }
}
