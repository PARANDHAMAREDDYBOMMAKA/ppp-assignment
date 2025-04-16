import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private List<Book> books = new ArrayList<>(); // Encapsulation: Private list of books

    // Method to add a new book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    // Method to fetch available books in the library
    public List<Book> getAvailableBooks() {
        List<Book> available = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) { // Check availability
                available.add(book);
            }
        }
        return available;
    }

    // Method to find a book by title
    public Book findBookByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) return b; // Book found by title
        }
        return null; // Book not found
    }
}
