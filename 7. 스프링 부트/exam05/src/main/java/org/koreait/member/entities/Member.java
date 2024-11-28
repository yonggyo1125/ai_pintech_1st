package org.koreait.member.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.koreait.global.entities.BaseEntity;
import org.koreait.member.constants.Authority;

@Data
@Entity
//@Table(name="KT_MEMBER")
public class Member extends BaseEntity {
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

    //@Lob // 오라클 기준 CLOB
    @Transient
    private String introduction;

    @Enumerated(EnumType.STRING)
    @Column(length=10, nullable = false)
    private Authority authority;

    // private int num;
    // private Integer num2;
    /*
    @Temporal(TemporalType.TIME)
    private Date birthDt;

     */

    @OneToOne // address_seq
    private Address address;
}
