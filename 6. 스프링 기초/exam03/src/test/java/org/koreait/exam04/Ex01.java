package org.koreait.exam04;

import org.junit.jupiter.api.Test;
import org.koreait.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        RecCalculator cal = ctx.getBean(RecCalculator.class);

        long result = cal.factorial(10L);
        System.out.println(result);

        ctx.close();
    }
}
