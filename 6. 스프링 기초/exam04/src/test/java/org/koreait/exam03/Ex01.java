package org.koreait.exam03;

import org.junit.jupiter.api.Test;
import org.koreait.global.configs.AppCtx;
import org.koreait.member.entities.Member;
import org.koreait.member.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig
@ContextConfiguration(classes = AppCtx.class)
public class Ex01 {

    @Autowired
    private MemberRepository repository;

    @Test
    void test1() {
        List<Member> items = repository.findAll();
        items.forEach(System.out::println);
    }

    @Test
    void test2() {
        repository.deleteById(1L);

    }

    @Test
    void test3() {
        Member member = repository.findByEmail("user03@test.org").get();
        System.out.println(member);
    }
}
