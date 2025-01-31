package org.koreait.member.entities;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Member {
    private long seq; // 회원 번호
    private String email; // 이메일
    private String password; // 비밀번호
    private String userName; // 회원명
    private LocalDateTime regDt; // 가입일시
    private LocalDateTime modDt; // 수정일시

    private String regDtStr;
}
