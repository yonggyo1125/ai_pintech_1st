package exam01;

public class Ex10 {
    public static void main(String[] args) {
        int num1= 100000000;
        float num2 = num1; // int   ->    float : 자동 형변환 (정수 -> 실수)

        long num3 = 1000000000000L; // 8바이트
        float num4 = num3; // long -> float
    }
}
