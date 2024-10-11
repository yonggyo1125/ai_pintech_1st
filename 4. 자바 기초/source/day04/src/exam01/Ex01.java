package exam01;

public class Ex01 {
    public static void main(String[] args) {
        int r = add(10, 20);
        System.out.println(r);
    }


    /**
     * num1, num2, result - 함수 지역 내에서만 유의미한 변수
     *  - 지역변수
     * @param num1
     * @param num2
     * @return
     */
    static int add(int num1, int num2) { // 함수 지역
        int result = num1 + num2;

        return result;
    }
}
