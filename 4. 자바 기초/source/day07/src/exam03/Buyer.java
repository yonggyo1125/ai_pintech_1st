package exam03;

public interface Buyer {
    int NUM = 10; // public static final

    void buy();
    default void order() { // JDK 7
        System.out.println("Buyer - 주문!");
        privateMethod();
    }

    private void privateMethod() { // JDK 9
        System.out.println("private 메서드");
    }

    static void staticMethod() { // public
        System.out.println("정적 메서드");
    }
}
