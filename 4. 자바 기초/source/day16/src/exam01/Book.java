package exam01;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private int isdn;
    private String title;
    private String author;
    private String publisher;

    public Book(int isdn, String title, String author, String publisher) {
        this.isdn = isdn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isdn == book.isdn && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(publisher, book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isdn, title, author, publisher);
    }

    @Override
    public String toString() {
        return "Book{" +
                "isdn=" + isdn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) { // 기본 정렬 기준
        //return isdn - o.isdn; // 도서 번호 오름차순 정렬
        //return o.isdn - isdn; // 도서 번호 내림차순 정렬
       //return (isdn - o.isdn) * -1; // 도서 번호 내림차순 정렬
        //return -(isdn - o.isdn);// 도서 번호 내림차순 정렬
        //return Integer.valueOf(isdn).compareTo(o.isdn); // 오름차순
        //return title.compareTo(o.title); // 책 제목으로 오름차순 정렬
        return o.title.compareTo(title); // 책 제목으로 내림차순 정렬
    }
}
