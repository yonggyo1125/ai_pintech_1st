package exam05;

import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        sum(10, 20, 30);
        sum(10, 20, 30, 40);
        sum(10, 20);

        int[] nums = { 10, 20, 30, 40, 50 };
        sum(nums);
    }

    public static int sum(int... nums) {
        // nums -> int[] 배열
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        return total;
    }
}
