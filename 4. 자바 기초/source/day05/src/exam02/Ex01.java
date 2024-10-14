package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();
        //s1.year = 2024; // 통제 불가
        //s1.month = 2;
        //s1.day = 31; // 31이라는 잘못된 값을 검증하고 대입을 통제하는 방법 X
        s1.setYear(2024);
        s1.setMonth(2);
        s1.setDay(31);

        s1.showDate();

        int month = s1.getMonth();
        System.out.println(month);

    }
}
