package org.koreait.member.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member")
public class MemberController {

    //@GetMapping("/member/login")
    /*
    @RequestMapping(path={"/member/login", "/user/login"},
                method={RequestMethod.GET, RequestMethod.POST})
    public String login() {
        System.out.println("로그인 페이지 유입!");
        return "member/form";
    } */

    // /member/login?type=어떤 값
    //@GetMapping(path="/login", params={"type"})   // /member/login

    // headers는 요청 헤더에 Authorization 값이 있는 경우만 유입
    //@GetMapping(path="/login", headers = "Authorization")
    @GetMapping("/login")
    public String login() {

        System.out.println("로그인 양식!");

        return "member/form";
    }

    @PostMapping("/login")   // /member/login
    public String loginPs() {

        return "member/form";
    }



    @GetMapping("/join") //  /member/join
    public String join() {

        return "member/joinForm";
    }

    @PostMapping("/join") // /member/join
    public String joinPs() {

        return "member/joinForm";
    }
}
