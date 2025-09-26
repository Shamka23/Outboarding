import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    static Map<Book, String> map = new HashMap<>();

    public static void main(String[] args) {
        Book book1 = new Book("Sueta", "Seutolog", 2000);
        addBook(new Book("Java", "Rupert Gnidovski", 2001), "Java Shelf");
        addBook(new Book("Java", "Rupert Gnidovski", 2002), "Education Shelf");
        addBook(book1, "Education Shelf");
        System.out.println(map);
        deleteBooks("Java", "Rupert Gnidovski", 0);
        System.out.println(map);
        searchBook("", "", 2000);
        searchAllBooks();
    }

    static void addBook(Book book, String location) {
        map.put(book, location != null ? location : "");
    }

    static void deleteBook(String bookTitle) {
        Iterator<Map.Entry<Book, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Book, String> entry = iterator.next();
            if (entry.getKey().getTitle().equals(bookTitle)) {
                iterator.remove();
                break;
            }
        }
    }

    static void deleteBooks(String bookTitle, String authorName, Integer year) {
        Iterator<Map.Entry<Book, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Book, String> entry = iterator.next();
            if (entry.getKey().getTitle().equals(bookTitle)
                    && entry.getKey().getAuthor().equals(authorName)
                    && entry.getKey().getYear() == year) {
                iterator.remove();
                break;
            } else if (entry.getKey().getTitle().equals(bookTitle)
                    && entry.getKey().getAuthor().equals(authorName)) {
                iterator.remove();
                break;
            } else if (entry.getKey().getTitle().equals(bookTitle)
                    && entry.getKey().getYear() == year) {
                iterator.remove();
                break;
            } else if (entry.getKey().getAuthor().equals(authorName) &&
                    entry.getKey().getYear() == year) {
                iterator.remove();
                break;
            } else if (entry.getKey().getTitle().equals(bookTitle)) {
                iterator.remove();
                break;
            } else if (entry.getKey().getAuthor().equals(authorName)) {
                iterator.remove();
                break;
            } else if (entry.getKey().getYear() == year) {
                iterator.remove();
                break;
            }

        }
    }

    static void searchBook(String bookTitle, String authorName, Integer year) {
       boolean found = false;
       for (Map.Entry<Book, String> entry : map.entrySet()) {
           Book key = entry.getKey();
           String location = entry.getValue();

           if ((bookTitle != null && key.getTitle().equals(bookTitle)) ||
               (authorName != null && key.getAuthor().equals(authorName)) ||
               (year != null && key.getYear() == year)) {
               System.out.println(location);
               found = true;
           }
       }
       if (!found) {
           System.out.println("Book not found");
       }
    }

    static void searchAllBooks() {
        Iterator<Map.Entry<Book, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Book, String> entry = iterator.next();
            System.out.println(entry.getKey().getTitle() + " " +
                               entry.getKey().getAuthor() + " " +
                               entry.getKey().getYear() + " " +
                               entry.getValue());
        }
    }
}
