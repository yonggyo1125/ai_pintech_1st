package org.koreait.member.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.koreait.member.validators.JoinValidator;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final JoinValidator joinValidator;

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
    public String joinPs(RequestJoin form, Errors errors) {

        joinValidator.validate(form, errors); // 커맨드 객체 검증


        return "member/joinForm"; // 임시
    }

}
