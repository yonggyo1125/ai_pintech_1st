package org.koreait.member.controllers;

import lombok.Data;

@Data
public class RequestJoin {
    private String email;
    private String password;
    private String confirmPassword;
    private String name;
    private String mobile; // 휴대전화 번호
    private boolean agree; // 회원가입 약관 동의 여부
}
