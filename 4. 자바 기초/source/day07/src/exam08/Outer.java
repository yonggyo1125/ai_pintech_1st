package exam08;

import exam02.Calculator;

public class Outer {

    private static final Calculator cal = new Calculator() {
        @Override
        public int add(int num1, int num2) {
            return num1 + num2;
        }
    };

    Calculator method(int num3) {

        // 익명 내부 클래스
        return new Calculator() {
            @Override
            public int add(int num1, int num2) {
                //num3 = 20; // final num3 ..  지역변수의 상수화, 제거 되지 않고 유지하기 위해서
                return num1 + num2 + num3;
            }
        };

        /*
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };

        return cal;

         */
        /*
        int result = cal.add(10, 20);
        System.out.println(result);

         */
    }
}
