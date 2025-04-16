public class LibraryApp {
    public static void main(String[] args) {
        LibraryService library = new LibraryService(); // Encapsulation: Using library service

        // Creating and adding books
        Book book1 = new Book("Java Basics", "John Doe");
        Book book2 = new Book("OOP Concepts", "Jane Smith");
        library.addBook(book1);
        library.addBook(book2);

        // Creating users (Member and Librarian)
        Member member = new Member("Sai", "M001");
        Librarian librarian = new Librarian("Sung", "L001");

        // Member borrows and returns books
        member.borrowBook(book1);
        member.returnBook(book1);

        // Librarian adds and checks in a book
        librarian.addBook(new Book("New Book", "New Author"));
        librarian.returnBook(book2);
    }
}
