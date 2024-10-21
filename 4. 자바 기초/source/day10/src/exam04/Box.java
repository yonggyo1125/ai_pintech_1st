package exam04;

public class Box<T extends Fruit & Eatable> { // 지네릭 클래스
    private T item; // Object item

    //private static T item2; // 처음부터 변수인 static은 자료형이 명확하게 정의 되어 있어야 한다.

    // new 연산자는 메모리 생성의 역할을 하는데, 자료형이 명확해야지만 할당 용량 계산 가능!
    //private T[] items = new T[3];

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public String toString() {
        // Apple item  -> info() X
        // Object item X
        // Fruit item O
        String info = item.info(); // apple.info()
        return info;
    }
}
