package org.koreait.member;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString
public class Member {
    private long seq; // 회원 번호
    private String email; // 이메일
    private String password;

}
