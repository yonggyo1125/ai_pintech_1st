package exam01;

import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        List<String> words = List.of("AA", "BBB", "CCC", "DDD", "EEEE");
        boolean result1 = words.stream().allMatch(s -> s.length() >= 3);
        System.out.println(result1);

        boolean result2 = words.stream().anyMatch(s -> s.length() >= 3);
        System.out.println(result2);
    }
}
