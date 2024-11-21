package exam01;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class Ex01 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        IntPredicate predicate = new IntPredicate() {
            @Override
            public boolean test(int value) { // 사용자 정의 기능
                //return value % 2 == 1; // 홀수
                return value % 2 == 0;
            }
        };

        int[] odds = Arrays.stream(nums).filter(predicate).toArray();
        System.out.println(Arrays.toString(odds));



        int[] odds2 = Arrays.stream(nums).filter(x ->  x % 2 == 1).toArray();
    }
}
