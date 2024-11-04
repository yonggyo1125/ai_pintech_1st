package exam01;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6};
        int[] nums2 = {1, 2, 3, 4, 5, 6};
        boolean isSame = Arrays.equals(nums1, nums2);
        System.out.println(isSame);

        int[][] nums3 = {{1,2,3}, {4,5,6}};
        int[][] nums4 = {{1,2,3}, {4,5,6}};
        boolean isSame2 = Arrays.deepEquals(nums3, nums4);
        System.out.println(isSame2);
    }
}
