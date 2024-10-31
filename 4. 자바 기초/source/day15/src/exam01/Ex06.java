package exam01;

import java.util.ArrayList;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {
        UniqueList<String> items = new UniqueList<>();
        items.add("이름1");
        items.add("이름1");
        items.add("이름2");
        items.add("이름3");
        items.add("이름4");
        items.add("이름5");

        System.out.println(items);

        List<String> tuple = List.of("이름1", "이름2"); // 변경 불가 리스트
        List<String> list = new ArrayList<>(tuple);

        //tuple.set(0, "이름3");

    }
}
