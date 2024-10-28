package exam01;

import java.util.function.Supplier;

public class Ex08 {
    public static void main(String[] args) {
        Book book = new Book();

        Supplier<String> title = () -> book.getTitle();


        Supplier<String> title2 = book::getTitle;
    }
}
