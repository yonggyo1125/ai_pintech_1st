package exam03;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }

        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length / 2; i++) {
            int index = nums.length - i - 1;
            int tmp = nums[i];
            nums[i] = nums[index];
            nums[index] = tmp;
        }
        System.out.println(Arrays.toString(nums));
        // 1 - 10
        // 2 - 10
    }
}
