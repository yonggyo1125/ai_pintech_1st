package exam07;

public class Outer {
    void method() {
        // 지역 내부 클래스
        class Inner {
            int add(int num1, int num2) {
                return num1 + num2;
            }
        }

        Inner in = new Inner();
        int result = in.add(10, 20);
        System.out.println(result);
    }
}
