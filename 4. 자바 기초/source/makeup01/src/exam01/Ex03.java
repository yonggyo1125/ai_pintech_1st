package exam01;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Ex03 {
    public static void main(String[] args) {
        // BiFunction<Integer, Integer, Integer> func = (a, b) -> a + b;
        /**
         * (a, b) -> Integer.valueOf(10) -> Integer a, Integer b
         */
        // BinaryOperator<Integer> func = (a,b) -> a + b;  // a.intValue() + b.intValue() // 언박싱
        IntBinaryOperator func = (a,b) -> a + b;
        int result = func.applyAsInt(10, 20);
        System.out.println(result);
    }
}
