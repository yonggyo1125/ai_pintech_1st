package org.koreait.exam04;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {

    private AnnotationConfigApplicationContext ctx;

    @BeforeEach
    void init() {
        ctx = new AnnotationConfigApplicationContext(AppCtx.class);
    }

    @AfterEach
    void close() {
        ctx.close();
    }

    @Test
    void test1() {

        //RecCalculator cal = ctx.getBean(RecCalculator.class);
        Calculator cal = ctx.getBean(Calculator.class);

        long result = cal.factorial(10L);
        System.out.println(result);
    }

    @Test
    void test2() {
        Calculator cal = ctx.getBean(Calculator.class);
        long r1 = cal.factorial(10L);
        System.out.printf("r1=%d%n", r1);

        long r2 = cal.factorial(10L);
        System.out.printf("r2=%d%n", r2);

        long r3 = cal.factorial(10L);
        System.out.printf("r3=%d%n", r3);
    }
}
