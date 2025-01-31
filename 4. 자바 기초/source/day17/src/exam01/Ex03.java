package exam01;

public class Ex03 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6};
        int[] nums2 = {1, 2, 3, 7, 5, 6};

        boolean isSame = true;
        for (int i = 0; i < nums1.length; i++) {
            int num1 = nums1[i];
            int num2 = nums2[i];
            if (num1 != num2) {
                isSame = false;
                break;
            }
        }

        System.out.println(isSame);
    }
}
