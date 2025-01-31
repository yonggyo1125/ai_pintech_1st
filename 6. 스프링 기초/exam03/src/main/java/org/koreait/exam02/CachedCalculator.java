package org.koreait.exam02;

import java.util.HashMap;
import java.util.Map;

public class CachedCalculator implements Calculator {

    private Map<Long, Long> cache = new HashMap<>();

    private Calculator cal;

    public CachedCalculator(Calculator cal) {
        this.cal = cal;
    }

    @Override
    public long factorial(long num) {

        if (cache.containsKey(num)) {  // 공통 기능
            System.out.println("캐시에 저장된 값 사용!");
            return cache.get(num);
        }

        long result = cal.factorial(num); // 핵심  기능 대신 수행

        cache.put(num, result); // 공통 기능
        System.out.println("캐시에 값을 저장!");

        return result;
    }
}
