package exam01;

import java.util.ArrayList;
import java.util.List;

public class UniqueList<E> {
    private List<E> items;

    public UniqueList() {
        this(10);
    }

    public UniqueList(int capacity) {
        items = new ArrayList<>(capacity);
    }

    public void add(E e) {
        if (!items.contains(e)) {
            items.add(e);
        }
    }

    public E get(int index) {
        return items.get(index);
    }

    @Override
    public String toString() {
        return "UniqueList{" +
                "items=" + items +
                '}';
    }
}
