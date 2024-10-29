package org.koreait.filters;

import jakarta.servlet.*;

import java.io.IOException;

public class MyFilter3 implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("MyFilter3 - 요청 전");

        chain.doFilter(request, response);

        System.out.println("MyFilter3 - 응답 후");
    }
}
