package org.koreait.exam01.config;

import org.koreait.exam01.Greeter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 스프링 컨터이너가 관리할 객체의 설정 클래스임을 알려준 애노테이션
public class AppCtx {

    @Bean // 스프링 컨테이너가 관리할 객체임을 알려주는 애노테이션
    public Greeter greeter() {
        return new Greeter();
    }
}
