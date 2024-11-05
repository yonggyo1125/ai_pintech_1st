package exam01;

import java.util.stream.IntStream;

public class Ex06 {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 100)
                    .filter(i -> i % 2 == 1)
                    .map(i -> i * i)
                    .sum();
        System.out.println(sum);
    }
}
