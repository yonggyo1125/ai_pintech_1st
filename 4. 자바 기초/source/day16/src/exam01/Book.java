package exam01;

public class Book {
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
    public String toString() {
        return "Book{" +
                "isdn=" + isdn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
