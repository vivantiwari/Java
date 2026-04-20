package com.library;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Add Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // Remove (Issue) Book by ID
    public void removeBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                books.remove(b);
                System.out.println("Book issued and removed!");
                return;
            }
        }
        System.out.println("Book not found!");
    }

    // Search Book by Title
    public void searchBook(String title) {
        boolean found = false;

        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                b.displayBook();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No book found with this title.");
        }
    }

    // Display All Books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\nAvailable Books:");
        for (Book b : books) {
            b.displayBook();
        }
    }
}
