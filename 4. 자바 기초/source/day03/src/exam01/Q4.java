package exam01;

public class Q4 {
    public static void main(String[] args) {
        // 4. 구구단을 홀수 단만 출력하도록 프로그램을 만드시오.
        for (int i = 2; i <= 9; i++) { // 단

            if (i % 2 == 0) { // 짝수단일때 건너띄기 -> 홀수단만 출력
                continue;
            }

            System.out.printf("--- %d단 ---%n", i);
            for (int j = 1; j <= 9; j++) { // 곱하는 수
                System.out.printf("%d X %d = %d%n", i, j, i * j);
            }

            /*
            if (i % 2 == 1) {
                System.out.printf("--- %d단 ---%n", i);
                for (int j = 1; j <= 9; j++) { // 곱하는 수
                    System.out.printf("%d X %d = %d%n", i, j, i * j);
                }
            }

             */
        }
    }
}
