package org.koreait.member.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class LoginController extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("서블릿 객체가 생성되면 최초 1번 실행");
    }

    @Override
    public void destroy() {
        System.out.println("서블릿 객체가 소멸되지 직전에 1번만 실행");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet()!");

        //resp.setContentType("text/html"); // 응답 헤더 text/html
        //resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.write("<h1>로그인</h1>");
    }
}
