package exam03;

public class Ex01 {
    public static void main(String[] args) {
        A a = new A();
        a.num1 = 10;  // 클래스 외부
        a.num2 = 20; // 클래스 외부

        a.method();
    }
}
