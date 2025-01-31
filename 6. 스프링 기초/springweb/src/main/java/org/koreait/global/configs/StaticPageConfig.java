package org.koreait.global.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 컨트롤러 빈이 없는 정적 페이지 연결 설정
 *
 */
@Configuration
public class StaticPageConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/mypage")
                .setViewName("member/mypage");


    }
}
