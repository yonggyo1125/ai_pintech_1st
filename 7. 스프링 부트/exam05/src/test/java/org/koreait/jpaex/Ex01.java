package org.koreait.jpaex;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.koreait.member.entities.Member;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class Ex01 {
    //@Autowired
    @PersistenceContext
    private EntityManager em; // 엔티티를 관리하는 매니저 객체

    @Test
    void test1() {
        Member member = new Member();
        member.setSeq(1L);
        member.setEmail("user01@test.org");
        member.setName("사용자01");
        member.setPassword("12345678");
        member.setRegDt(LocalDateTime.now());

        em.persist(member); // 엔티티를 영속성 컨텍스트(관리 메모리) 넣어준다! - 변화 감지를 할 수 있는 상태 된다!

        em.flush(); // DB에 영구 반영 - SQL 실행
    }
}
