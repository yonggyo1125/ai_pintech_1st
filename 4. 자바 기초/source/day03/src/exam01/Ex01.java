package exam01;

public class Ex01 {
    public static void main(String[] args) {
        // 구구단
        for (int i = 2; i <= 9; i++) { // 2단 ~ 9단
            System.out.println("--- " + i + "단 ---");
            for (int j = 1; j <= 9; j++) { // 1~9
                System.out.println(i + " X " + j + " = " + i * j);
            }
        }
    }
}
