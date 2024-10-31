package exam01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("항목1");
        items.add("항목2");
        items.add("항목3");
        items.add("항목4");
        items.add("항목5");

        System.out.println(items); // items.toString();

        Iterator<String> iter = items.iterator();

        while(iter.hasNext()) {
            String item = iter.next();
            System.out.println(item);
        }

        iter = items.iterator(); // 반복을 더 하려면 새로운 Iterator 객체를 생성!
        while(iter.hasNext()) {
            String item = iter.next();
            System.out.println(item);
        }
    }
}
