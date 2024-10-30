package org.koreait.board.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/board/view")
public class BoardViewController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/templates/board/view.jsp");
        rd.forward(req, resp);
    }

    /*
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        RequestDispatcher rd = req.getRequestDispatcher("/outlines/header.jsp");
        rd.include(req, resp);

        PrintWriter out = resp.getWriter();
        out.write("<main><h1>메인 영역...</h1></main>");

        RequestDispatcher rd2 = req.getRequestDispatcher("/outlines/footer.jsp");
        rd2.include(req, resp);
    } */
}
