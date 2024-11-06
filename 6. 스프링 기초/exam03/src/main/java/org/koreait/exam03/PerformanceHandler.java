package org.koreait.exam03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PerformanceHandler implements InvocationHandler {

    private final Class<?> clz;

    public PerformanceHandler(Class<?> clz) {
        this.clz = clz;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long stime = System.nanoTime(); // 공통 기능
        try {

            Object obj = clz.getDeclaredConstructor().newInstance();
            Object result = method.invoke(obj, args); // 핵심기능 대신 수행

            return result;
        } finally {
            long etime = System.nanoTime();  // 공통 기능
            System.out.printf("걸린시간: %d%n", etime - stime);
        }
    }
}
