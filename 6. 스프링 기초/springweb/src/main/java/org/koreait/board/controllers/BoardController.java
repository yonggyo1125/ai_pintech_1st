package org.koreait.board.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    @GetMapping("/list")
    public String list() {

        return "board/list";
    }

    @GetMapping("/write")
    public String write() {

        return "board/write";
    }

    @PostMapping("/write")
    public String writePs() {

        return "board/write";
    }
}
