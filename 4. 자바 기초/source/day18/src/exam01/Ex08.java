package exam01;

import java.util.Arrays;
import java.util.Random;

public class Ex08 {
    public static void main(String[] args) {
        Random random = new Random();

        long[] nums = random.longs().limit(10).toArray();
        System.out.println(Arrays.toString(nums));
    }
}
