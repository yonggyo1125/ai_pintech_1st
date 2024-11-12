package org.koreait.member.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/join")
    public String join() {

        return "member/join";
    }

    @PostMapping("/join")
    public String joinPs() {

        return "redirect:/member/login";
    }
}
