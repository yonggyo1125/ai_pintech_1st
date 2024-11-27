package org.koreait.member.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
//@Table(name="KT_MEMBER")
public class Member {
    @Id //  기본키
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue
    private Long seq;

    @Column(length=65, nullable = false, unique = true)
    private String email;

    @Column(length=65, nullable = false)
    private String password;

    @Column(length=40, nullable = false)
    private String name;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime regDt;

    @Column(insertable = false)
    @UpdateTimestamp
    private LocalDateTime modDt;
}
