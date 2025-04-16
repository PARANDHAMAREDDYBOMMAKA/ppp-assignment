public abstract class User {
    protected String name; // Shared attribute: User's name (accessible in subclasses)
    protected String id; // Shared attribute: User's ID (accessible in subclasses)

    // Constructor to initialize a user with name and ID
    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Abstract methods for borrowing and returning books (to be implemented by subclasses)
    public abstract void borrowBook(Book book); 
    public abstract void returnBook(Book book); 

    // Getter for user's name
    public String getName() {
        return name;
    }

    // Getter for user's ID
    public String getId() {
        return id;
    }
}
