import java.util.*;

// Book class to represent a book
class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    // Getters and setters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", available=" + isAvailable +
                '}';
    }
}

// Library class to manage books
class Library {
    private Map<String, Book> books; // ISBN as key
    private Scanner scanner;

    public Library() {
        books = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    // Add a new book to library
    public void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author name: ");
        String author = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();

        if (books.containsKey(isbn)) {
            System.out.println("Book with this ISBN already exists!");
            return;
        }

        books.put(isbn, new Book(title, author, isbn));
        System.out.println("Book added successfully!");
    }

    // Issue a book (mark as unavailable)
    public void issueBook() {
        System.out.print("Enter ISBN of book to issue: ");
        String isbn = scanner.nextLine();

        Book book = books.get(isbn);
        if (book == null) {
            System.out.println("Book not found!");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Book is already issued!");
            return;
        }

        book.setAvailable(false);
        System.out.println("Book issued successfully!");
    }

    // Return a book (mark as available)
    public void returnBook() {
        System.out.print("Enter ISBN of book to return: ");
        String isbn = scanner.nextLine();

        Book book = books.get(isbn);
        if (book == null) {
            System.out.println("Book not found!");
            return;
        }

        if (book.isAvailable()) {
            System.out.println("Book is already in library!");
            return;
        }

        book.setAvailable(true);
        System.out.println("Book returned successfully!");
    }

    // Display information about a specific book
    public void showBookInfo() {
        System.out.print("Enter ISBN to get book info: ");
        String isbn = scanner.nextLine();

        Book book = books.get(isbn);
        if (book == null) {
            System.out.println("Book not found!");
            return;
        }

        System.out.println(book);
    }

    // Display all books in library
    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library!");
            return;
        }

        System.out.println("\n--- ALL BOOKS ---");
        for (Book book : books.values()) {
            System.out.println(book);
        }
        System.out.println("------------------");
    }
}

// Main class to run the system
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Show Book Info");
            System.out.println("5. Show All Books");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    library.addBook();
                    break;
                case 2:
                    library.issueBook();
                    break;
                case 3:
                    library.returnBook();
                    break;
                case 4:
                    library.showBookInfo();
                    break;
                case 5:
                    library.showAllBooks();
                    break;
                case 6:
                    System.out.println("Thank you for using Library Management System!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}