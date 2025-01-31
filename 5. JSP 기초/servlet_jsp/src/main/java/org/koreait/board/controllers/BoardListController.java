package org.koreait.board.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.koreait.board.entities.Board;
import org.koreait.board.services.BoardInfoService;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/board/list")
public class BoardListController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BoardInfoService infoService = new BoardInfoService();

        List<Board> items = infoService.getList();
        req.setAttribute("items", items);

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/templates/board/list.jsp");
        rd.forward(req, resp);
    }

    /*
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("게시판 목록!");

        resp.setContentType("text/html; charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.write("<h1>게시판 목록!</h1>");

    }
     */
}
