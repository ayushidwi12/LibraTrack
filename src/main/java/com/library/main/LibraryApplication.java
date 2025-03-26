package com.library.main;

import com.library.models.Book;
import com.library.services.LibraryService;

import java.util.Scanner;

public class LibraryApplication {  // Class name updated
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Digital Library Management ====");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Search Book by Title");
            System.out.println("5. Update Book Details");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            try {
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter Book ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter Author: ");
                        String author = scanner.nextLine();
                        System.out.print("Enter Genre: ");
                        String genre = scanner.nextLine();
                        System.out.print("Is Available? (true/false): ");
                        boolean isAvailable = scanner.nextBoolean();
                        libraryService.addBook(new Book(id, title, author, genre, isAvailable));
                        System.out.println("Book added successfully!");
                    }
                    case 2 -> libraryService.viewAllBooks().forEach(System.out::println);
                    case 3 -> {
                        System.out.print("Enter Book ID: ");
                        int bookId = scanner.nextInt();
                        System.out.println(libraryService.searchBookById(bookId));
                    }
                    case 4 -> {
                        System.out.print("Enter Title: ");
                        String title = scanner.nextLine();
                        libraryService.searchBookByTitle(title).forEach(System.out::println);
                    }
                    case 5 -> {
                        System.out.print("Enter Book ID to update: ");
                        int bookId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter new Title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter new Author: ");
                        String author = scanner.nextLine();
                        System.out.print("Enter new Genre: ");
                        String genre = scanner.nextLine();
                        System.out.print("Is Available? (true/false): ");
                        boolean isAvailable = scanner.nextBoolean();
                        libraryService.updateBook(bookId, title, author, genre, isAvailable);
                        System.out.println("Book updated successfully!");
                    }
                    case 6 -> {
                        System.out.print("Enter Book ID to delete: ");
                        int bookId = scanner.nextInt();
                        libraryService.deleteBook(bookId);
                        System.out.println("Book deleted successfully!");
                    }
                    case 7 -> {
                        System.out.println("Exiting... Goodbye!");
                        scanner.close();
                        return; // Exit loop instead of System.exit()
                    }
                    default -> System.out.println("Invalid choice! Try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
