package exam01;

import java.util.Optional;

public class Ex02 {
    public static void main(String[] args) {
        Book book = null;
        Optional<Book> opt = Optional.ofNullable(book);
        Book book2 = opt.orElse(new Book());
        Book book3 = opt.orElseGet(() -> {
            Book b = new Book();
            b.setTitle("책1");
            b.setAuthor("저자1");
            return b;
        });

        System.out.println(book2);
        System.out.println(book3);


        //book.setTitle("책1");
    }
}
