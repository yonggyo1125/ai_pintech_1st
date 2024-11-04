package org.koreait.exam01;

import org.junit.jupiter.api.Test;
import org.koreait.global.configs.AppCtx;
import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.services.InfoService;
import org.koreait.member.services.JoinService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        //JoinService service = ctx.getBean("joinService", JoinService.class);
        JoinService service = ctx.getBean(JoinService.class);
        //InfoService infoService = ctx.getBean("infoService", InfoService.class);
        InfoService infoService = ctx.getBean(InfoService.class);

        RequestJoin form = new RequestJoin();
        form.setEmail("user01@test.org");
        form.setPassword("12345678");
        form.setConfirmPassword("12345678");
        form.setUserName("사용자01");
        form.setAgree(true);

        service.process(form); // 회원 가입 처리

        infoService.print(); // 가입한 회원 목록 출력

        ctx.close();
    }
}
