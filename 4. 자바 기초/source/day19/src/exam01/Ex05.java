package exam01;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex05 {
    public static void main(String[] args) {
        List<Book> items = IntStream.rangeClosed(1, 100)
                .mapToObj(i -> new Book("책" + i, "저자" + i, (int)(Math.random() * 10000) + 1000)).toList();

        Map<Boolean, List<Book>> data = items.stream().collect(Collectors.partitioningBy(b -> b.getPrice() >= 10000));

        System.out.println("---- 만원 이상 책 -----");
        List<Book> over_10000 = data.get(true);
        over_10000.forEach(System.out::println);

    }
}
