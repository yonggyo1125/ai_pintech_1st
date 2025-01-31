package exam01;

import java.util.stream.Stream;

public class Ex06 {
    public static void main(String[] args) {
        String[] strs = Stream.of("Apple", "Orange", "Melon")
                .toArray(x -> new String[x]);

        String[] strs2 = Stream.of("Apple", "Orange", "Melon")
                .toArray(String[]::new);
    }
}
