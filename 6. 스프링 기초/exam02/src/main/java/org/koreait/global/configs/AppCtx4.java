package org.koreait.global.configs;

import org.koreait.member.repositories.MemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "org.koreait.member"
        //, excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, classes = ManualBean.class)
        //, excludeFilters = @ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE, classes = MemberRepository.class)
       // , excludeFilters = @ComponentScan.Filter(type= FilterType.ASPECTJ, pattern="org.koreait..*Repository")
)
public class AppCtx4 {
    /*
    @Bean
    public MemberRepository memberRepository() {
        System.out.println("호출!");
        return new MemberRepository();
    } */
}
