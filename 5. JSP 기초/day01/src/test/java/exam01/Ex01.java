package exam01;

import org.junit.jupiter.api.Test;
import org.koreait.member.Member;

public class Ex01 {
    @Test
    void test1() {
        //Member member = new Member(1L, "user01@test.org", "12345678");
        //Member member = new Member("user01@test.org", "12345678");

        /*
        member.setSeq(1L);
        member.setEmail("user01@test.org");
        member.setPassword("12345678");
        */
        //System.out.println(member);
    }

    @Test
    void test2() {
        //Member member = new Member();
        Member member = Member.builder()
                .seq(1L)
                .email("user01@test.org")
                .password("12345678")
                .build();
        System.out.println(member);
    }
}
