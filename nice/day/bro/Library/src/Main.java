import java.util.HashMap;
import java.util.Map;

public class Main {
    Map<Book, String> map = new HashMap<>();

    static void main() {
        Book book = new Book("Java", "Rupert Gnidovski", 2002);
        book.equals(null);
    }
}
