package exam02;

public class Ex05 {
    public static void main(String[] args) {
        int[] nums1 = {10, 20, 30, 40};
        int[] nums2 = nums1;
        nums2[1] = 22;
        System.out.println(nums1[1]);
    }
}
