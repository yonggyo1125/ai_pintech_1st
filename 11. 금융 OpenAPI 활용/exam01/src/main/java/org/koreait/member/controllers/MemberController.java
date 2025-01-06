package org.koreait.member.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {

    @PostMapping("/join")
    public void joinPs(RequestJoin form) {
        System.out.println(form);
    }
}
