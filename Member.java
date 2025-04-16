public class Member extends User {

    // Constructor for initializing a Member user
    public Member(String name, String id) {
        super(name, id); // Inheritance: Inherited attributes from the User class
    }

    // Polymorphism: Member-specific implementation of borrowing a book
    @Override
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrow(); // Mark the book as borrowed
            System.out.println(name + " borrowed " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is not available.");
        }
    }

    // Polymorphism: Member-specific implementation of returning a book
    @Override
    public void returnBook(Book book) {
        book.returnBook(); // Mark the book as returned
        System.out.println(name + " returned " + book.getTitle());
    }
}
