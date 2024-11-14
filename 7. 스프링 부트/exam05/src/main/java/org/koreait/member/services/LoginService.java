package org.koreait.member.services;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.koreait.member.controllers.RequestLogin;
import org.koreait.member.entities.Member;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final HttpSession session;

    public void process(RequestLogin form) {

        /* DB에서 데이터를 가져왔다고 가정! */
        Member member = new Member();
        member.setSeq(1L);
        member.setEmail(form.getEmail());
        member.setName("이이름");
        member.setRegDt(LocalDateTime.now());

        session.setAttribute("loggedMember", member);

    }
}
