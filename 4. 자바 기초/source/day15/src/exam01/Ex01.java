package exam01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<String> items = new LinkedList<>();
        items.add("항목1");
        items.add("항목2");
        items.add("항목3");
        items.add("항목4");
        items.add("항목5");

        for (String item : items) {
            System.out.println(item);
        }
    }
}
