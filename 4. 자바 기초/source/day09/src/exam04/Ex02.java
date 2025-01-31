package exam04;

public class Ex02 {
    public static void main(String[] args) {
        Transportation trans = Transportation.SUBWAY;
        // java.lang.Enum의 하위 클래스 임을 체크?
        System.out.println(trans instanceof Enum);
        Enum<Transportation> trans2 = trans;

    }
}
