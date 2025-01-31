package org.koreait.jpaex;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.koreait.member.entities.Member;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@SpringBootTest
@ActiveProfiles({"default", "test"})
public class Ex04 {

    @PersistenceContext
    private EntityManager em;
    /*
    @BeforeEach
    void init() {
        em.getTransaction().begin();
    }

    @AfterEach
    void destroy() {
        em.getTransaction().commit();
    }
    */

    @Test
    void test1() {
        for (int i = 1; i <= 10; i++) {
            Member member = new Member();
            member.setEmail("user" + i + "@test.org");
            member.setPassword("12345678");
            member.setName("사용자" + i);

            em.persist(member);
        }

        em.flush();
        em.clear();

        Member member1 = em.find(Member.class, 1L);
        Member member2 = em.find(Member.class, 2L);

        System.out.println(member1);
        System.out.printf("member1.regDt:%s, member1.modDt:%s%n", member1.getRegDt(), member1.getModDt());
        System.out.println(member2);
        System.out.printf("member2.regDt:%s, member2.modDt:%s%n", member2.getRegDt(), member2.getModDt());

        member1.setName("(수정)사용자1");
        em.flush();

        em.clear();
        member1 = em.find(Member.class, 1L);
        System.out.printf("member1.regDt:%s, member1.modDt:%s%n", member1.getRegDt(), member1.getModDt());

    }
}
