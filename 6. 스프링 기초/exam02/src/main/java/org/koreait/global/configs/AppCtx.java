package org.koreait.global.configs;

import org.koreait.member.repositories.MemberRepository;
import org.koreait.member.services.InfoService;
import org.koreait.member.services.JoinService;
import org.koreait.member.validators.JoinValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AppCtx2.class)
public class AppCtx {
    /*
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

    @Bean
    public InfoService infoService() {
        InfoService service = new InfoService();
        service.setRepository(memberRepository());

        return service;
    } */
}
