package org.koreait.exam02;

import org.junit.jupiter.api.Test;

public class Ex01 {
    @Test
    void test1() {
        long stime = System.nanoTime();
        ImplCalculator cal1 = new ImplCalculator(); // 성능 좋다
        long result1 = cal1.factorial(10L);
        System.out.printf("cal1: %d%n", result1);
        long etime = System.nanoTime();
        System.out.printf("cal1 걸린시간: %d%n", etime - stime);

        stime = System.nanoTime();
        RecCalculator cal2 = new RecCalculator(); // 성능이 좋지 않음
        long result2 = cal2.factorial(10L);
        System.out.printf("cal2: %d%n", result2);
        etime = System.nanoTime();
    }
}
