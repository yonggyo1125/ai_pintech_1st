package org.koreait.jpaex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.member.constants.Authority;
import org.koreait.member.entities.Member;
import org.koreait.member.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

@SpringBootTest
@ActiveProfiles({"default", "test"})
public class Ex05 {

    @Autowired
    private MemberRepository repository;

    @BeforeEach
    void init() {
        for (int i = 1; i <= 10; i++) {
            Member member = new Member();
            member.setEmail("user" + i + "@test.org");
            member.setPassword("1234");
            member.setName("사용자" + i);
            member.setAuthority(Authority.USER);
            repository.save(member);  // persist(...)
        }

        repository.flush(); //DB에 영구 반영
    }

    @Test
    void test1() {
        List<Member> members = repository.findAll();
        members.forEach(System.out::println);
    }
}
