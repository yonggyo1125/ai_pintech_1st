package org.koreait.builerEx;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"default", "test"})
public class Ex01 {

    @Test
    void test1() {
        User user = User.builder()
                .email("user01@test.org")
                .password("12345678")
                .name("이이름")
                .build();

        System.out.println(user);
    }
}
