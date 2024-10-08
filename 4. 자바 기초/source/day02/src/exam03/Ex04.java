package exam03;

public class Ex04 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            /*
            if (i == 50) {
                continue; // 현재 반복 중단, 새로 반복 시작 - 건너 뛰기
            }*/
            //if (i % 2 == 1) { // 홀수만 더하기
              //  total += i;
            //}
            if (i % 2 == 0) {
                continue;
            }

            total += i;

            /*
            if (i == 50) {
                break; // 반복 중단

            }*/
        }

        System.out.println(total);
    }
}
