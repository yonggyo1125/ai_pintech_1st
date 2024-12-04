package org.koreait.member.controllers;

import lombok.extern.slf4j.Slf4j;
import org.koreait.member.constants.Authority;
import org.koreait.member.entities.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/member")
public class ApiMemberController {
    //@GetMapping(path="/test1", produces = MediaType.TEXT_XML_VALUE)
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

    @GetMapping("/test2")
    public List<Member> test2() {
        List<Member> members = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Member member = new Member();
            member.setSeq((long)i);
            member.setName("사용자" + i);
            member.setPassword("12345678");
            member.setAuthority(Authority.USER);
            member.setEmail("user" + i + "@test.org");
            member.setRegDt(LocalDateTime.now());
            member.setModDt(LocalDateTime.now());
            members.add(member);
        }

        return members;
    }

    @PostMapping("/test3")
    public void test3(RequestLogin form) {
        log.info(form.toString());
    }
}
