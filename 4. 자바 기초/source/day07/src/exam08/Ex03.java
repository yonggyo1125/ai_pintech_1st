package exam08;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Ex03 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        /*
        IntPredicate p = new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value % 2 == 1;
            }
        };

        int[] odds = Arrays.stream(nums).filter(p).toArray();
        System.out.println(Arrays.toString(odds));

         */
        /*
        int[] odds = Arrays.stream(nums).filter(new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value % 2 == 1;
            }
        }).toArray();

         */
        int[] odds = Arrays.stream(nums).filter( x -> x % 2 == 1).toArray();

    }
}
