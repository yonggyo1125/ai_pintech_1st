package org.koreait.member.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {
    /**
     * 회원가입 양식
     *
     * @return
     */
    @GetMapping("/join")
    public String join() {
        return "member/joinForm";
    }

    /**
     * 회원 가입 처리!
     * @return
     */
    @PostMapping("/join")
    public String joinPs() {

        return "member/joinForm"; // 임시
    }

}
