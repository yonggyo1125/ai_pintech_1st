package assignment;

import java.time.LocalDate;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            // 년도와 월 입력 받기
            System.out.print("년:");
            int year = sc.nextInt();
            System.out.print("월:");
            int month = sc.nextInt();

            // 선택한 월의 마지막 날짜 구하기
            LocalDate sDate = LocalDate.of(year, month, 1);
            LocalDate eDate = sDate.plusMonths(1L).minusDays(1L);
            int endOfMonth = eDate.getDayOfMonth();

            // 선택한 월의 시작 요일 구하기 0(일)~6(토)
            int yoil = sDate.getDayOfWeek().getValue() % 7;

            // 출력
            System.out.println("일  월  화  수  목  금  토");
            System.out.println("---------------------");

            for (int i = -yoil + 1, j = 1; i <= endOfMonth; i++, j++) {
                if (i > 0) System.out.printf("%02d ", i);
                else System.out.printf("%s", "   ");

                if (j % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}
