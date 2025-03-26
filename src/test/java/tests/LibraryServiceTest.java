package tests;

import com.library.models.Book;
import com.library.services.LibraryService;
import com.library.exceptions.BookNotFoundException;
import com.library.exceptions.DuplicateBookException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceTest {
    private LibraryService libraryService;

    @BeforeEach
    void setUp() {
        libraryService = new LibraryService();
        libraryService.addBook(new Book(1, "Java Basics", "John Doe", "Programming", true));
    }

    @Test
    void testAddDuplicateBookThrowsException() {
        assertThrows(DuplicateBookException.class, () ->
                libraryService.addBook(new Book(1, "Java Basics", "John Doe", "Programming", true)));
    }

    @Test
    void testSearchBookByIdNotFoundThrowsException() {
        assertThrows(BookNotFoundException.class, () -> libraryService.searchBookById(99));
    }
}
