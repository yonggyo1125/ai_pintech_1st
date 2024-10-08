package exam03;

public class Ex01 {
    public static void main(String[] args) {
        int num = 1, total = 0; // 동일 자료형이면 나열식으로 변수 선언과 초기화 가능
        // num : 초기값, 초기화식

        //int total = 0;
        while(num <= 100) { // 조건식
            // 조건식이 참일때 반복 실행되는 코드

            //total = total + num;
            total += num;

            num++; // 증감식
            //num = num + 1;
        }

        System.out.println(total);
    }
}
