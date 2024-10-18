package exam03;

public class Ex04 {
    public static void main(String[] args) {
        Integer num1 = 100; // 오토박싱
        Integer num2 = 200; // 오토박싱

        Integer num3 = num1 + num2;  // num1.intValue() + num2.intValue() - 언박싱
        // 오토 박싱

        System.out.println(num3);
    }
}
