package exam02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD}) // 적용 대상, 클래스명 위, 메서드드 위
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String[] value(); // 기본 설정 항목
    int min() default 1;
    int max() default 10;
}