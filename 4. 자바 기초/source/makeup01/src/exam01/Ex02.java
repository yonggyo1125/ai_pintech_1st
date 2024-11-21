package exam01;

import java.util.function.Function;

public class Ex02 {
    public static void main(String[] args) {
        Function<Integer, String> func = x -> "*".repeat(x);
        String stars = func.apply(3);
        System.out.println(stars);
    }
}
