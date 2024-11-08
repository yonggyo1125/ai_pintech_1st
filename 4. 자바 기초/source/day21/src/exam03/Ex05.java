package exam03;

import java.time.LocalDate;

public class Ex05 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate sdate = LocalDate.of(today.getYear(), today.getMonthValue(), 1);
        int yoil = sdate.getDayOfWeek().getValue();
        System.out.println(yoil);
        LocalDate edate = sdate.plusMonths(1L).minusDays(1L);
        System.out.println(sdate);
        System.out.println(edate);
    }
}
