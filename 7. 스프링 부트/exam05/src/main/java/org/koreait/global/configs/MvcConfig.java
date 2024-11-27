package org.koreait.global.configs;

import org.koreait.etc.Greet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableScheduling // 스케줄링 설정 자동화
@EnableJpaAuditing // 엔티티 변화감지 리스너 설정이 자동화
//@RequiredArgsConstructor
public class MvcConfig implements WebMvcConfigurer {

    //private final JoinValidator joinValidator;

    /**
     * 모든 @Valid가 적용된 커맨드 객체 검증에 사용
     * @return
     */
    /*
    @Override
    public Validator getValidator() {
        return joinValidator;
    }

     */
    @Bean
    //@Profile("prod")
    //@Primary // 빈이 충돌될때 가장 먼저 선택
    public Greet greetProd() {
        System.out.println("prod profile!");
        Greet greet = new Greet();
        greet.setName("prod에서..");

        return greet;
    }
    /*
    @Bean
    //@Profile("dev")
    public Greet greetDev() {
        System.out.println("dev profile!");
        Greet greet = new Greet();
        greet.setName("dev에서...");

        return greet;
    } */
}
