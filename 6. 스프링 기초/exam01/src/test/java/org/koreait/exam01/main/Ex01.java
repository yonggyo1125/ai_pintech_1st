package org.koreait.exam01.main;

import org.junit.jupiter.api.Test;
import org.koreait.exam01.Greeter;
import org.koreait.exam01.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        /**
         * AnnotationConfig : 설정 방식
         * AppicationContext : 스프링 컨테이너
         */

        Greeter g1 = ctx.getBean("greeter", Greeter.class);
        g1.hello("연우");

        Greeter g2 = ctx.getBean("greeter", Greeter.class);

        System.out.println(g1 == g2); // 싱글톤 형태로 객체를 관리!1

        ctx.close();
    }
}
