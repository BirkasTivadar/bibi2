package genericsusage.withoutgenerics;

import genericsusage.Book;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    public void shouldThrowExceptionIfArgumentIsNull() {
        assertThrows(NullPointerException.class, () -> new Library().getFirstBook(null));
    }

    @Test
    public void shouldThrowExceptionIfArgumentIsEmptyList() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Library().getFirstBook(new ArrayList<>()));
        assertEquals("Argument should not be empty!", ex.getMessage());
    }

    @Test
    public void shouldThrowExceptionAddingDifferentObjects() {
        Library library = new Library();
        Exception ex = assertThrows(ClassCastException.class, () -> library.getFirstBook(Arrays.asList("", "", "")));
        assertEquals("Not a book", ex.getMessage());
    }

    @Test
    public void shouldReturnFirst() {
        assertEquals("Egri Csillagok", new Library().getFirstBook(Arrays.asList(new Book("Egri Csillagok"), new Book("AntigonĂ©"))).getTitle());
    }

}