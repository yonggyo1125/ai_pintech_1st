package org.koreait.jpaex;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.member.entities.Member;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Transactional
@ActiveProfiles({"default", "test"})
@SpringBootTest
public class Ex03 {
    @PersistenceContext
    private EntityManager em;

    private Member member;

    @BeforeEach
    void init() {
        member = new Member();
        member.setSeq(1L);
        member.setEmail("user01@test.org");
        member.setName("사용자01");
        member.setPassword("12345678");
        member.setRegDt(LocalDateTime.now());

        em.persist(member); // 영속 상태 - 변화 감지 상태
        em.flush();
        em.clear(); // 영속성 비우기 (관리되는 엔티티를 모두 제거)
    }

    @Test
    void test1() {
        Member member2 = em.find(Member.class, 1L); // DB 직접 SQL 실행 -> 엔티티 -> 영속성 컨텍스트에 보관(1차 캐시)
        System.out.println(member2);
        System.out.println(member2 == member); // false

        Member member3 = em.find(Member.class, 1L); // 영속성 컨텍스트에서 바로 조회(1차 캐시 사용)
        System.out.println(member3);
        System.out.println(member3 == member2); // true
    }
}
