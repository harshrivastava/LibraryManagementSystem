📚 Library Management System (Java Console Application)
📝 Overview

The Library Management System is a simple Java-based console application that helps manage a collection of books.
It allows users to add, issue, return, and view books using an interactive command-line interface.

This project demonstrates core concepts of Object-Oriented Programming (OOP) in Java such as:

Classes and Objects

Encapsulation

Data management using Collections (HashMap)

User interaction using Scanner

⚙️ Features

➕ Add Book: Add new books to the library with title, author, and ISBN.

📖 Issue Book: Issue a book (mark it as unavailable).

🔄 Return Book: Return an issued book (mark it as available).

🔍 Show Book Info: View detailed information about a specific book using its ISBN.

📚 Show All Books: Display all books currently in the library.

❌ Exit: Exit the application safely.

🧩 Class Structure
Book

Represents a single book entity with:

title (String)

author (String)

isbn (String)

isAvailable (boolean)

Library

Handles all the main library operations like:

Adding, issuing, and returning books

Searching for books by ISBN

Displaying all books in the system

Uses a HashMap<String, Book> to store books efficiently.

LibraryManagementSystem

Main class that runs the menu-driven system and interacts with the user through the console.

🧠 Concepts Used

Encapsulation: Book properties are private and accessed through getters/setters.

Collections (HashMap): Used for storing and retrieving books by ISBN.

Exception Handling: Input validation and checks for existing or missing books.

Loops & Conditionals: For user interaction and menu navigation.

🚀 How to Run
1️⃣ Compile the program:
javac LibraryManagementSystem.java

2️⃣ Run the program:
java LibraryManagementSystem

3️⃣ Follow on-screen options:

Example interaction:

===== LIBRARY MANAGEMENT SYSTEM =====
1. Add Book
2. Issue Book
3. Return Book
4. Show Book Info
5. Show All Books
6. Exit
Choose an option:

🧾 Example Output
Enter book title: The Silent Patient
Enter author name: Alex Michaelides
Enter ISBN: 12345
Book added successfully!

===== LIBRARY MANAGEMENT SYSTEM =====
1. Add Book
2. Issue Book
3. Return Book
4. Show Book Info
5. Show All Books
6. Exit
Choose an option: 5

--- ALL BOOKS ---
Book{title='The Silent Patient', author='Alex Michaelides', isbn='12345', available=true}
------------------

💡 Future Enhancements

Add file storage or database to save books permanently.

Implement a user login system for librarians.

Include search by title/author feature.

Develop a GUI version using Java Swing or JavaFX.

👨‍💻 Author

Harsh Shrivastava
Computer Science Major
📧 Email: (add your contact if you want)
💼 GitHub: [your-github-username]
