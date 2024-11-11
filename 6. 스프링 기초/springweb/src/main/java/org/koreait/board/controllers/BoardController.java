package org.koreait.board.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    @GetMapping(path={"/list", "/list/{bid}"})
    public String list(@PathVariable(name="bid", required = false) String id) { // 경로 변수
        System.out.printf("bid=%s%n", id);
        return "board/list";
    }

    @GetMapping("/write/{bid}")
    public String write(@PathVariable("bid") String bid) {

        return "board/write";
    }

    @PostMapping("/write")
    public String writePs() {

        return "board/write";
    }
}
