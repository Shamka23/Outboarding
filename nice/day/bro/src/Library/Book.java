package Library;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class Book {
    private final String title;
    private final String author;
    private final Integer year;

    public Book(String title, String author, Integer year) {
        this.title = validate(title);
        this.author = validate(author);
        this.year = validate(year);
    }

    private String validate(String string) {
        if (string != null && !string.isEmpty()) {
            return string;
        }
        return "";
    }

    private Integer validate(Integer integer) {
        if (integer != null && integer > 0) {
            return integer;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    public String toString(Map<Book, String> bookLocation) {

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
