package exam08;

import exam02.Calculator;

public class Ex01 {
    public static void main(String[] args) {
        Outer out = new Outer();
        Calculator cal = out.method(30);
        int result = cal.add(10, 20);
        System.out.println(result);
    }
}
