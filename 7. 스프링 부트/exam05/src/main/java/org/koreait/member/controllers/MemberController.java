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

        if (errors.hasErrors()) { // 검증 실패! - reject, rejectValue가 한번이라도 호출 되었다!
            return "member/joinForm"; // 검증 실패하면 사용자에게 양식을 다시 보여주고, 검증 실패 정보를 제공!
        }

        // 검증 성공시 - 가입 처리 서비스 호출

       return "redirect:/member/login"; // 가입 성공시 로그인 페이지로 이동
    }

}
