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
@SpringBootTest
@ActiveProfiles({"default", "test"})
public class Ex02 {

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
    }

    @Test
    void test1() {
        member.setName("(수정)사용자01");
        em.flush();

        em.detach(member); // 영속성 분리 상태 - 변화감지 X

        member.setName("(수정2)사용자01");

        em.flush();

        /**
         * 분리된 상태의 엔티티의 변경 상태를 비교하기 위해서
         * SELECT 문이 한번 수행되고 DB와 차이가 있는 경우 UPDATE를 실행
         */
        em.merge(member); // 영속성 상태로 변경 - 변화감지 O

        member.setPassword("(수정)12345678");

        em.flush();
    }
}
