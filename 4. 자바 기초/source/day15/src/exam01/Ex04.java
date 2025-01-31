package exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ex04 {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("항목1");
        items.add("항목2");
        items.add("항목3");
        items.add("항목4");
        items.add("항목5");

        ListIterator<String> iter = items.listIterator();
        System.out.println("----- 순방향 -----");
        while(iter.hasNext()) {
            String item = iter.next();
            System.out.println(item);
        }

        System.out.println("----- 역방향 -----");
        while(iter.hasPrevious()) {
            String item = iter.previous();
            System.out.println(item);
        }
    }
}
