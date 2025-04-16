public class Author {
    private String name; // Encapsulated: Name of the author (private)
    private String nationality; // Encapsulated: Nationality of the author (private)

    // Constructor to initialize an author with name and nationality
    public Author(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    // Encapsulation: Getter for the author's name
    public String getName() {
        return name;
    }

    // Encapsulation: Getter for the author's nationality
    public String getNationality() {
        return nationality;
    }
}
