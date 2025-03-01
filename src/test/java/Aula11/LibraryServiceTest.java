package Aula11;

import org.junit.Test;
import weg.arquiteturaSoftware.Aula11.Library.BookInventoryService;
import weg.arquiteturaSoftware.Aula11.Library.LibraryService;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LibraryServiceTest {

    @Test
    public void testLendBookWithAvailableStock() {
        BookInventoryService inventoryService = new BookInventoryService();
        LibraryService libraryService = new LibraryService(inventoryService);

        boolean result = libraryService.lendBookToUser("Java Programming");
        assertTrue(result, "Book should be lend");
    }

    @Test
    public void testLendBookWithNotAvailableStock() {
        BookInventoryService inventoryService = new BookInventoryService();
        LibraryService libraryService = new LibraryService(inventoryService);

        libraryService.lendBookToUser("Python Fundamentals");
        libraryService.lendBookToUser("Python Fundamentals");

        boolean result = libraryService.lendBookToUser("Python Fundamentals");
        assertFalse(result, "Book should not be lend");
    }


}
