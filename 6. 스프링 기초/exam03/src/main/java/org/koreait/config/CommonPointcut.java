package org.koreait.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CommonPointcut {
    @Pointcut("execution(* org.koreait.exam04..*(..))")
    public void publicTarget() {

    }
}
