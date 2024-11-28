package org.koreait.tests;

import com.github.javafaker.Faker;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.member.constants.Authority;
import org.koreait.member.entities.Member;
import org.koreait.member.entities.QMember;
import org.koreait.member.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@SpringBootTest
@ActiveProfiles({"default", "test"})
public class Ex05 {
    @Autowired
    private MemberRepository repository;

    @PersistenceContext
    private EntityManager em;

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
        JPAQueryFactory factory = new JPAQueryFactory(em);

        QMember member = QMember.member;

        JPAQuery<Member> query = factory.selectFrom(member)
                .where(member.name.contains("민"))
                .offset(3) // 시작 위치 0 부터 시작
                .limit(3)  // 한페이지당 조회 갯수
                .orderBy(member.regDt.desc(), member.email.asc());

        List<Member> members = query.fetch();
        members.forEach(System.out::println);
    }
}
