package exam08;

public class Ex04 {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            public void methodA() {
                System.out.println("재정의된 메서드A");
            }
        };

        a.methodA();
    }
}
