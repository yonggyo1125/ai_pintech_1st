package exam01;

public class Ex07 {
    public static void main(String[] args) {
        int num1 = 10;
        /**
         * 단락 회로 평가
         * 논리 연산에서 이미 값이 결정된 경우 다음 항 연산  X
         */
        //boolean result = num1++ > 10 && (num1 = num1 + 20) > 20;
        boolean result = ++num1 > 11 || (num1 = num1 + 20) < 30;
        System.out.println(num1);
        System.out.println(result);


    }
}
