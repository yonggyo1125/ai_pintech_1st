package exam05;

import java.util.HashSet;
import java.util.Set;

public class Ex05 {
    public static void main(String[] args) {
        Set<String> items = new HashSet<>();
        items.add(new String("ABC"));
        items.add(new String("ABC"));
        items.add("ABC");
        items.add("DEF");
        items.add("GHI");

        System.out.println(items);
    }
}
