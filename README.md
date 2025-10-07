# 📚 Library Management System (Java Console Application)

## 📝 Overview

The **Library Management System** is a Java-based console application designed to help manage a collection of books. It allows users to add, issue, return, and view books through an interactive command-line interface.

This project demonstrates core concepts of **Object-Oriented Programming (OOP)** in Java, including:

- **Classes and Objects**
- **Encapsulation**
- **Collections** (`HashMap`)
- **User Interaction** (`Scanner`)
- **Exception Handling**

---

## ⚙️ Features

- **➕ Add Book:** Add new books with title, author, and ISBN.
- **📖 Issue Book:** Issue a book (mark as unavailable).
- **🔄 Return Book:** Return an issued book (mark as available).
- **🔍 Show Book Info:** View details of a specific book by ISBN.
- **📚 Show All Books:** Display all books in the library.
- **❌ Exit:** Safely exit the application.

---

## 🧩 Class Structure

### `Book`
Represents a single book entity:
- `title` (String)
- `author` (String)
- `isbn` (String)
- `isAvailable` (boolean)

### `Library`
Handles main library operations:
- Add, issue, and return books
- Search by ISBN
- Display all books
- Uses `HashMap<String, Book>` for efficient storage

### `LibraryManagementSystem`
Main class that runs the menu-driven system and interacts with the user via the console.

---

## 🧠 Concepts Used

- **Encapsulation:** Book properties are private, accessed via getters/setters.
- **Collections:** `HashMap` for storing and retrieving books by ISBN.
- **Exception Handling:** Input validation and checks for existing/missing books.
- **Loops & Conditionals:** For user interaction and menu navigation.

---

## 🚀 Getting Started

### 1️⃣ Prerequisites
- Java JDK installed ([Download here](https://www.oracle.com/java/technologies/downloads/))
- Command-line access

### 2️⃣ Compile the Program
```sh
javac LibraryManagementSystem.java
```

### 3️⃣ Run the Program
```sh
java LibraryManagementSystem
```

### 4️⃣ Follow On-Screen Options

#### Example Interaction
```
===== LIBRARY MANAGEMENT SYSTEM =====
1. Add Book
2. Issue Book
3. Return Book
4. Show Book Info
5. Show All Books
6. Exit
Choose an option:
```

#### Example Output
```
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
```

---

## 💡 Future Enhancements

- Add file storage or database for persistent book data
- Implement user login system for librarians
- Add search by title/author
- Develop a GUI version using Java Swing or JavaFX

---

## 👨‍💻 Author

**Harsh Shrivastava**  
Computer Science Major  
📧 Email: *(add your contact if you want)*  
💼 GitHub: [your-github-username](https://github.com/your-github-username)

---

## 📄 License

This project is open-source and available under the [MIT License](LICENSE).

---

## 🤝 Contributing

Contributions, issues, and feature requests are welcome!  
Feel free to check [issues page](https://github.com/your-github-username/library-management-system/issues).
