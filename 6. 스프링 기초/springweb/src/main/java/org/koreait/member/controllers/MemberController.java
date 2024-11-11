package org.koreait.member.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {

    @GetMapping("/member/login")
    public String login(@RequestParam("name") String name) {

        System.out.printf("name:%s%n", name);

        return "member/form";
    }
}
