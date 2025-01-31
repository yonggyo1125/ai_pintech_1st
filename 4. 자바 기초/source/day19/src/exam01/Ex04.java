package exam01;

import java.util.Random;

public class Ex04 {
    public static void main(String[] args) {
        Random random = new Random();
        int odd = random.ints().filter(x -> x % 2 == 1).findFirst().orElse(-1);
        System.out.println(odd);
    }
}
