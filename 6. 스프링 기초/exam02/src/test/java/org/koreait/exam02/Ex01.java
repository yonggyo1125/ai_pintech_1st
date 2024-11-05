package org.koreait.exam02;

import org.junit.jupiter.api.Test;
import org.koreait.global.configs.AppCtx4;
import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.services.InfoService;
import org.koreait.member.services.JoinService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {

    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx4.class);
        JoinService joinService = ctx.getBean(JoinService.class);
        InfoService infoService = ctx.getBean(InfoService.class);

        RequestJoin form = new RequestJoin();
        form.setEmail("user01@test.org");
        form.setPassword("12345678");
        form.setConfirmPassword("12345678");
        form.setUserName("사용자01");
        form.setAgree(true);

        joinService.process(form);
        infoService.print();

        ctx.close();
    }
}
