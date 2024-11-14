package org.koreait.global.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
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
}
