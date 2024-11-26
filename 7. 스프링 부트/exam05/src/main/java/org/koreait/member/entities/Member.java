package org.koreait.member.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Member {
    @Id //  기본키
    private Long seq;
    private String email;
    private String password;
    private String name;
    private LocalDateTime regDt;
    private LocalDateTime modDt;
}
