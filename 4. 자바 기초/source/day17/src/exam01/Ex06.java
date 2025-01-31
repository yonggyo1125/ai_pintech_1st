package exam01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>(List.of("항목2", "항목3", "항목4", "항목1", "항목5"));
        Collections.rotate(items, 2);
        System.out.println(items);

        Collections.shuffle(items);
        System.out.println(items);
    }
}
