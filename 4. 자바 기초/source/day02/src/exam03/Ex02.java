package exam03;

public class Ex02 {
    public static void main(String[] args) {
        int num = 1, total = 0; ///

        do {

            total += num;

            num++;
        } while(num <= 100);

        System.out.println(total);
    }
}
