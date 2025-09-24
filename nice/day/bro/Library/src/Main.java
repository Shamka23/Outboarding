import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    static Map<Book, String> map = new HashMap<>();


    public static void main(String[] args) {
        Book book1 = new Book("Sueta", "Seutolog", 2000);
        addBook(new Book("Java", "Rupert Gnidovski", 2001), "Java Shelf");
        addBook(new Book("Java", "Rupert Gnidovski", 2002), "Java Shelf");
        addBook(book1, "Education Shelf");
        System.out.println(map);
        deleteBook("Java");
        System.out.println(map);
    }

    static void addBook(Book book, String location) {
        map.put(book, location);
    }

    static void deleteBook(String titleName, String authorName, int year) {

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
}
