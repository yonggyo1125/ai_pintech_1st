package exam03;

import java.time.LocalDate;

public class Ex01 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2024,11,1);
        System.out.println(date1);

        LocalDate date2 = LocalDate.now(); // 현재 날짜
        System.out.println(date2);
    }
}
