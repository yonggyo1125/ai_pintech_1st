package exam01;

import static exam01.Transportation.*;

public class Ex04 {
    public static void main(String[] args) {
        System.out.println(BUS.getTitle());
        System.out.println(SUBWAY.getTitle());
        System.out.printf("버스 10명: %d%n", BUS.getTotal(10));
        System.out.printf("지하철 10명: %d%n", SUBWAY.getTotal(10));
        System.out.printf("택시 10명: %d%n", TAXI.getTotal(10));
    }
}
