package Library;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    private static final Map<Book, String> bookLocation = new HashMap<>();

    public static void main(String[] args) {
        Book bookFirst = new Book("Sueta", "Seutolog", 2000);
        addBook(new Book("Java", "Rupert Gnidovski", 2001), "Java Shelf");
        addBook(new Book("Java", "Rupert Gnidovski", 2002), "Education Shelf");

        addBook(bookFirst, "Education Shelf");
        System.out.println(bookLocation);

//        deleteBooks("Java", "Rupert Gnidovski", 0);
//        System.out.println(bookLocation);

        searchBook("", "", 2000);
        searchAllBooks(bookLocation);

        System.out.println();
    }

    static void addBook(Book book, String location) {
        bookLocation.put(book, location != null ? location : "");
    }

    static void deleteBookByTitle(String Title) {
        Iterator<Map.Entry<Book, String>> iterator = bookLocation.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Book, String> entry = iterator.next();
            if (entry.getKey().getTitle().equals(Title)) {
                iterator.remove();
                break;
            }
        }
    }

    static void deleteBooks(String Title, String authorName, Integer year) {
        Iterator<Map.Entry<Book, String>> iterator = bookLocation.entrySet().iterator();
        while (iterator.hasNext()) {
           Book book = iterator.next().getKey();

           boolean match =
                   (Title != null && book.getTitle().equals(Title)) ||
                   (authorName != null && book.getAuthor().equals(authorName)) ||
                   (year != null && book.getYear() == year);

           if (match) {
               iterator.remove();
           }

        }
    }

    static void searchBook(String bookTitle, String authorName, Integer year) {
        for (Map.Entry<Book, String> entry : bookLocation.entrySet()) {
            Book key = entry.getKey();
            String location = entry.getValue();

            if ((bookTitle != null && key.getTitle().equals(bookTitle)) ||
                    (authorName != null && key.getAuthor().equals(authorName)) ||
                    (year != null && key.getYear() == year)) {
                System.out.println(location);
            }
        }
    }



    static void searchAllBooks(Map<Book, String> bookLocation) {
        System.out.println(Book.toString(bookLocation));
        Iterator<Map.Entry<Book, String>> iterator = bookLocation.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Book, String> entry = iterator.next();
            System.out.println(entry.getKey().getTitle() + " " +
                    entry.getKey().getAuthor() + " " +
                    entry.getKey().getYear() + " " +
                    entry.getValue());
        }
    }
}
