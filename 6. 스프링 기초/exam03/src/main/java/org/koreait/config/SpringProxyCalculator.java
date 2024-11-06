package org.koreait.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SpringProxyCalculator {

    @Pointcut("execution(* org.koreait.exam04..*(..))")
    public void publicTarget() {

    }

    @Around("publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {

        Object result = joinPoint.proceed(); // 핵심 기능을 대신 수행

        System.out.println("호출!!!");

        return result;
    }
}
