package org.koreait.filters;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

public class CommonRequestWrapper extends HttpServletRequestWrapper {
    public CommonRequestWrapper(ServletRequest request) {
       super((HttpServletRequest) request);

       // 요청시 공통 코드 ...

        System.out.println("요청 공통 코드 처리...");
    }
}
