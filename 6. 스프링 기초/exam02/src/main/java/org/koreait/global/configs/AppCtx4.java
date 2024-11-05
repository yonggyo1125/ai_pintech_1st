package org.koreait.global.configs;

import org.koreait.member.repositories.MemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.koreait.member")
public class AppCtx4 {
    /*
    @Bean
    public MemberRepository memberRepository() {
        System.out.println("호출!");
        return new MemberRepository();
    } */
}
