package exam01;

public class Ex01 {

    /**
     * main 함수는 프로그램을 시작해 주는 함수
     * @param args
     */
    public static void main(String[] args) {
        //int num1 = 10; // main 함수의 지역 변수
        //int num2 = 20;
        //int result = add(num1, num2);
       // System.out.println(r);

        int result1 = add(10, 20); // int add(int, int)
        System.out.println(result1);

        int result2 = add(10, 20, 30); // int add(int, int, int)
        System.out.println(result2);
    }


    /**
     * num1, num2, result - 함수 지역 내에서만 유의미한 변수
     *  - add함수의 지역변수
     * @param num1
     * @param num2
     * @return
     */
    static int add(int num1, int num2) { // 함수 지역
        int result = num1 + num2;

        return result;
    }

    static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
