package com.library.services;

import com.library.models.Book;
import com.library.exceptions.BookNotFoundException;
import com.library.exceptions.DuplicateBookException;
import java.util.*;

public class LibraryService {
    private final Map<Integer, Book> bookCollection = new HashMap<>();

    public void addBook(Book book) {
        if (bookCollection.containsKey(book.getBookId())) {
            throw new DuplicateBookException("Book ID already exists!");
        }
        bookCollection.put(book.getBookId(), book);
    }

    public List<Book> viewAllBooks() {
        return new ArrayList<>(bookCollection.values());
    }

    public Book searchBookById(int bookId) {
        if (!bookCollection.containsKey(bookId)) {
            throw new BookNotFoundException("Book not found!");
        }
        return bookCollection.get(bookId);
    }

    // ✅ Added missing method to search books by title
    public List<Book> searchBookByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookCollection.values()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        if (result.isEmpty()) {
            throw new BookNotFoundException("No book found with title: " + title);
        }
        return result;
    }

    public void updateBook(int bookId, String title, String author, String genre, boolean isAvailable) {
        Book book = searchBookById(bookId);
        book.setTitle(title);
        book.setAuthor(author);
        book.setGenre(genre);
        book.setAvailable(isAvailable);
    }

    public void deleteBook(int bookId) {
        if (bookCollection.remove(bookId) == null) {
            throw new BookNotFoundException("Book not found!");
        }
    }
}
