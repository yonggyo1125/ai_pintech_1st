package exam01;

import java.util.Set;
import java.util.TreeSet;

public class Ex03 {
    public static void main(String[] args) {
        Set<String> items = new TreeSet<>();
        items.add("이름3");
        items.add("이름2");
        items.add("이름1");
        items.add("이름5");
        items.add("이름4");

        items.forEach(System.out::println);
    }
}
