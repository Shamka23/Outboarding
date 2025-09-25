import java.util.Objects;

public class Book {
    private final String title;
    private final String author;
    private final Integer year;

    public Book(String title, String author, Integer year) {
        this.title = title != null ? title : "";
        this.author = author  != null ? author : "";
        this.year = year != null ? year : 0;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }


    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Book book = (Book) obj;

        return obj != null &&
                this.title.equals(book.title) &&
                this.author.equals(book.author) &&
                this.year == book.year;
    }
}
