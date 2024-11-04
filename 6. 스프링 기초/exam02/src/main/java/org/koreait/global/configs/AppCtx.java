package org.koreait.global.configs;

import org.koreait.member.repositories.MemberRepository;
import org.koreait.member.services.JoinService;
import org.koreait.member.validators.JoinValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {

    @Bean
    public JoinValidator joinValidator() { // 메서드 명이 기본 빈의 이름
        return new JoinValidator();
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemberRepository();
    }

    @Bean
    public JoinService joinService() {
        return new JoinService(joinValidator(), memberRepository());
    }
}
