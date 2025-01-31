package org.koreait.member.services;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.koreait.member.controllers.RequestLogin;
import org.koreait.member.entities.Member;
import org.koreait.member.exceptions.MemberNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final HttpSession session;
    private final HttpServletResponse response;

    public void process(RequestLogin form) {
        // 임시 - 예외 공통 처리 테스트
        String email = form.getEmail();
        if (!email.equals("user01@test.org")) {
            throw new MemberNotFoundException();
        }


        /* DB에서 데이터를 가져왔다고 가정! */
        Member member = new Member();
        member.setSeq(1L);
        member.setEmail(form.getEmail());
        member.setName("이이름");
        member.setRegDt(LocalDateTime.now());

        session.setAttribute("loggedMember", member);

        /**
         *  이메일 기억하기가 체크 되어 있으면 쿠키 값에 저장
         *  체크가 해제 되어 있으면 쿠키 삭제
          */
        Cookie cookie = new Cookie("savedEmail", form.getEmail());
       if (form.isSaveEmail()) {
            cookie.setMaxAge(60 * 60 * 24 * 30);
       } else {
            cookie.setMaxAge(0);
       }

       response.addCookie(cookie);
    }
}
