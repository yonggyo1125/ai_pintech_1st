package org.koreait.tests;

import org.junit.jupiter.api.Test;
import org.koreait.etc.Greet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// test - spring.profiles.active=default,test
@SpringBootTest
public class Ex02 {

    @Autowired
    private Greet greet;

    @Test
    void test1() {

    }
}
