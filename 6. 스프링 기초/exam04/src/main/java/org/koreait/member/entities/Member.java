package org.koreait.member.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
public class Member {
    @Id // 기본키로 사용할 컬럼
    private Long seq;
    private String email;
    private String password;
    private String username;
    private LocalDateTime regdt;
    private LocalDateTime moddt;
}
