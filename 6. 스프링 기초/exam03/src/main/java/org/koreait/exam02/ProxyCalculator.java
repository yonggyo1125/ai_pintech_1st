package org.koreait.exam02;

public class ProxyCalculator implements Calculator {

    private Calculator cal;

    public ProxyCalculator(Calculator cal) {
        this.cal = cal;
    }

    @Override
    public long factorial(long num) {
        long stime = System.nanoTime(); // 공통 기능
        try {

            long result = cal.factorial(num); // 핵심 기능을 대신해서 수행!

            return result;

        } finally { // 공통 기능
            long etime = System.nanoTime();
            System.out.printf("걸린시간: %d%n", etime - stime);
        }
    }
}
