package org.koreait.exam02;

import org.junit.jupiter.api.Test;
import org.koreait.global.configs.AppCtx4;
import org.koreait.member.services.JoinService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {

    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx4.class);
        JoinService joinService = ctx.getBean(JoinService.class);

        ctx.close();
    }
}
