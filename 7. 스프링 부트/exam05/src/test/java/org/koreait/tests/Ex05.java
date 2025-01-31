package org.koreait.tests;

import com.github.javafaker.Faker;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.member.constants.Authority;
import org.koreait.member.entities.Member;
import org.koreait.member.entities.QMember;
import org.koreait.member.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@SpringBootTest
@ActiveProfiles({"default", "test"})
public class Ex05 {
    @Autowired
    private MemberRepository repository;

    @Autowired
    private JPAQueryFactory factory;

    @BeforeEach
    void init() {
        Faker faker = new Faker(Locale.KOREA);
        List<Member> members = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            Member member = new Member();
            member.setEmail(faker.internet().emailAddress());
            member.setPassword(faker.regexify("[a-zA-Z0-9]{8,16}"));
            member.setAuthority(Authority.USER);
            member.setName(faker.name().fullName());
            members.add(member);
        }

        repository.saveAllAndFlush(members);
    }

    @Test
    void test1() {

        QMember member = QMember.member;

        BooleanBuilder andBuilder = new BooleanBuilder();
        andBuilder.and(member.name.contains("민"))
                .and(member.email.contains("@"))
                .and(member.regDt.after(LocalDateTime.now().minusDays(1L)));

        JPAQuery<Member> query = factory.selectFrom(member)
                .where(andBuilder)
                .offset(3) // 시작 위치 0 부터 시작
                .limit(3)  // 한페이지당 조회 갯수
                .orderBy(member.regDt.desc(), member.email.asc());

        List<Member> members = query.fetch();
        members.forEach(System.out::println);
    }

    @Test
    void test2() {
        QMember member = QMember.member;
        BooleanBuilder andBuilder = new BooleanBuilder();
        andBuilder.and(member.name.contains("민"))
                .and(member.email.contains("@"))
                .and(member.regDt.after(LocalDateTime.now().minusDays(1L)));

        List<Member> members = (List<Member>)repository.findAll(andBuilder);
        members.forEach(System.out::println);
    }
}
