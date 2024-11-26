package org.koreait.tests;

import java.math.BigDecimal;


public class Ex00 {


    public static void main(String[] args) {
        double total = 0;
        for (int i = 0; i < 10; i++) {
            total += 0.1;
        }
        System.out.println(total);  // 0.9999999999999999

        BigDecimal num1 = new BigDecimal(0);
        for (int i = 0; i < 10; i++) {
            BigDecimal num2 = num1.add(new BigDecimal(0.1));
            num1 = num2;
        }

        System.out.println(num1); // 1.0000000000000000555111512312578270211815834045410156250
    }
}
