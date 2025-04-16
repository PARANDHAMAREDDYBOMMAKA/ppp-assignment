public class Book {
    private String title; // Encapsulated: Title of the book (private for data protection)
    private String author; // Encapsulated: Author of the book (private)
    private boolean isAvailable = true; // Encapsulated: Availability status of the book (private)

    // Constructor to initialize the book with title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Encapsulation: Getter to check if the book is available
    public boolean isAvailable() {
        return isAvailable;
    }

    // Method to borrow the book (mark as unavailable)
    public void borrow() {
        isAvailable = false; // Change availability status
    }

    // Method to return the book (mark as available)
    public void returnBook() {
        isAvailable = true; // Change availability status back
    }

    // Getter for book title
    public String getTitle() {
        return title;
    }

    // Getter for book author
    public String getAuthor() {
        return author;
    }
}
