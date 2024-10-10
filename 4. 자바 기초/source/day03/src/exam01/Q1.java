package exam01;

public class Q1 {
    public static void main(String[] args) {
        // 1. 변수 두 개를 선언해서 20과 3.0을 대입하고 두 변수의 사칙연산 결과를 정수로 출력해 보시오
        int num1 = 20;
        double num2 = 3.63;

        //System.out.println((int)(num1 * num2));
        //int result = num1 * (int)num2; // 오답
        int result = (int)(num1 * num2); // 정답
        System.out.println(result);
    }
}
