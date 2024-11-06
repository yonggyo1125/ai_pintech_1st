package org.koreait.exam03;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

public class Ex01 {
    @Test
    void test1() {
        Class<RecCalculator> clazz = RecCalculator.class;
        Calculator cal = (Calculator) Proxy.newProxyInstance(
                clazz.getClassLoader(),
                new Class[] { clazz },
                new PerformanceHandler(clazz)
        );
    }
}
