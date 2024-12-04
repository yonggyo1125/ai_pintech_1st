package org.koreait.member.controllers;

import org.koreait.member.constants.Authority;
import org.koreait.member.entities.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/member")
public class ApiMemberController {
    @GetMapping("/test1")
    public Member test1() {
        Member member = new Member();
        member.setSeq(1L);
        member.setName("이이름");
        member.setPassword("12345678");
        member.setAuthority(Authority.USER);
        member.setEmail("user01@test.org");
        member.setRegDt(LocalDateTime.now());
        member.setModDt(LocalDateTime.now());

        return member;
    }
}
