package exam04;

public class Box<T> { // 지네릭 클래스
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
