package org.koreait.tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.member.constants.Authority;
import org.koreait.member.entities.Member;
import org.koreait.member.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static org.springframework.data.domain.Sort.Order.asc;
import static org.springframework.data.domain.Sort.Order.desc;

@SpringBootTest
@ActiveProfiles({"default", "test"})
public class Ex04 {
    @Autowired
    private MemberRepository repository;

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
        //List<Member> members = repository.findByNameContainingOrderByRegDtDesc("");
        //members.forEach(System.out::println);

        // 0페이지, 한페이지당 3개씩
        Pageable pageable = PageRequest.of(2, 3);
        Page<Member> data = repository.findByNameContainingOrderByRegDtDesc("", pageable);

        List<Member> members = data.getContent(); // 조회된 목록
        long total = data.getTotalElements(); // 전체 갯수
        int pages = data.getTotalPages(); // 전체 페이지 갯수

        members.forEach(System.out::println);
        System.out.printf("total=%d, pages=%d%n", total, pages);

    }

    @Test
    void test2() {
        //Pageable pageable = PageRequest.of(1, 3, Sort.by(Sort.Order.desc("regDt"), Sort.Order.asc("email"))); // 1 - 2페이지
        Pageable pageable = PageRequest.of(1, 3, Sort.by(desc("regDt"), asc("email")));
        Page<Member> data = repository.findAll(pageable);
        List<Member> members = data.getContent();
        members.forEach(System.out::println);
    }

    @Test
    void test3() {
        List<Member> members = repository.getMembers("%민%");
        members.forEach(System.out::println);
    }
}
