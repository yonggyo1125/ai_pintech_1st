package exam02;

public class Ex01 {
    public static void main(String[] args) {
        int num = 15;
        if (num == 10) { // 조건식이 참일때 실행
            System.out.println("10 입니다.");
        } else { // 조건식이 참이 아닐때 실행
            System.out.println("10이 아닙니다.");
        }

        // 간단한 조건식은 삼항조건연산자로 대체
        String result = num == 10 ? "10 입니다." : "10이 아닙니다.";
        System.out.println(result);
    }
}
