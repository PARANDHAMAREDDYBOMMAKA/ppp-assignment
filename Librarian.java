public class Librarian extends User {

    // Constructor for initializing a Librarian user
    public Librarian(String name, String id) {
        super(name, id); // Inheritance: Inherited attributes from the User class
    }

    // Polymorphism: Librarians cannot borrow books, so we override borrowBook to prevent it
    @Override
    public void borrowBook(Book book) {
        System.out.println("Librarian " + name + " can't borrow books.");
    }

    // Polymorphism: Librarians can return books to the library
    @Override
    public void returnBook(Book book) {
        System.out.println("Librarian " + name + " is checking in " + book.getTitle());
        book.returnBook(); // Return the book
    }

    // Additional function for Librarians: adding a book to the library
    public void addBook(Book book) {
        System.out.println("Book '" + book.getTitle() + "' added by Librarian " + name);
    }
}
