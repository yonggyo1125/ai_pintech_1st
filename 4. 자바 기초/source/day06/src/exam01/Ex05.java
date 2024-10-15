package exam01;

public class Ex05 {
    public static void main(String[] args) {
        A ac = new C(); // 출처가 C 클래스 객체
        A ad = new D(); // 출처가 D 클래스 객체
        System.out.println(ac == ad);

        /*1
        C c1 = (C)ad; // 상위 클래스 자료형 -> 하위 클래스 자료형 (명시적 형변환)
        */
        if (ad instanceof C) {
            C c1 = (C)ad;
            System.out.println("유입1");
        }

        if (ac instanceof C) {
            C c2 = (C)ac;
            System.out.println("유입2");
        }

        if (ac instanceof C c) { // 출처 체크 하고 이상 없으면 C로 형변환
            System.out.println(c.numC);
        }
    }
}
