# Library Management System (LMS)

### Industry: Education  
### OOP Concepts: Inheritance, Polymorphism, Encapsulation, Abstraction

---

## Overview

This **Library Management System** (LMS) is designed to manage books, authors, and patrons, demonstrating key **Object-Oriented Programming (OOP)** concepts. It features different user types, such as **Member** and **Librarian**, each with distinct roles and responsibilities. This system allows users to borrow and return books, and the librarian can add new books to the library.

### OOP Principles Applied:
1. **Encapsulation**: Sensitive data such as book availability and user details are encapsulated within their respective classes, ensuring safe data handling.
2. **Inheritance**: Common behavior between different types of users (Member and Librarian) is inherited from an abstract `User` class, which contains shared methods.
3. **Polymorphism**: Different actions for borrowing and returning books are implemented through method overriding in `Member` and `Librarian`, showcasing polymorphic behavior.
4. **Abstraction**: The abstract `User` class defines common user-related behaviors, while the actual implementation is left to its subclasses (i.e., `Member` and `Librarian`).

---

## Project Structure:
```plaintext
├── Book.java               # Represents a book in the library
├── Author.java             # Represents an author of a book
├── User.java               # Abstract class for common user behavior
├── Member.java             # A class representing a library member (inherits User)
├── Librarian.java          # A class representing a librarian (inherits User)
├── LibraryService.java     # Service class to manage library books
└── LibraryApp.java         # Main application to test the system functionality
