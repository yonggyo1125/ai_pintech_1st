package org.koreait.exam01;

import org.junit.jupiter.api.Test;
import org.koreait.exam01.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class); // 객체 생성 -> 의존설정 -> 초기화

        Message m1 = ctx.getBean(Message.class);
        m1.send("안녕하세요!");

        ctx.close(); // 소멸 전 destroy() 호출
    }
}
