package exam03;

public class Ex03 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1, j = 10; i <= 100; i++, j--) {
            total += i;
            System.out.println(j);
        }

        System.out.println(total);
    }
}
