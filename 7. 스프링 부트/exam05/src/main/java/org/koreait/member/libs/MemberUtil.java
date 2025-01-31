package org.koreait.member.libs;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberUtil {
    private final HttpSession session;

    public boolean isLogin() {

        return session.getAttribute("loggedMember") != null;
    }
}
