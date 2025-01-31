package org.koreait.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebInitParam;

import java.io.IOException;

/*
@WebFilter(value = "/*", initParams = {
        @WebInitParam(name="k1", value="v1"),
        @WebInitParam(name="k2", value="v2")
}) */
public class CommonFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
       String k1 = filterConfig.getInitParameter("k1");
       String k2 = filterConfig.getInitParameter("k2");
        System.out.printf("k1=%s, k2=%s%n", k1, k2);

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        chain.doFilter(new CommonRequestWrapper(request), response);
    }
}
