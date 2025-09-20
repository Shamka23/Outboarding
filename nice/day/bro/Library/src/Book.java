public class Book {
    private final String title;
    private final String author;
    private final int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public int hashCode() {
        return
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
