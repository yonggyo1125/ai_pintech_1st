package org.koreait.exam01;

import org.junit.jupiter.api.Test;
import org.koreait.global.configs.AppCtx;
import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.services.JoinService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        JoinService service = ctx.getBean("joinService", JoinService.class);

        RequestJoin form = new RequestJoin();
        form.setEmail("user01@test.org");
        form.setPassword("12345678");
        form.setConfirmPassword("12345678");
        form.setUserName("사용자01");
        form.setAgree(true);

        service.process(form);

        ctx.close();
    }
}
