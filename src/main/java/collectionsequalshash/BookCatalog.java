package collectionsequalshash;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookCatalog {

    public Book findBookByTitleAuthor(List<Book> books, String title, String author) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                return book;
            }
        }
        return null;
    }

    public Book findBook(List<Book> books, Book book) {
        if (books.contains(book)) {
            return book;
        } else {
            return findBookByTitleAuthor(books, book.getTitle(), book.getAuthor());
        }
    }

    public Set<Book> addBooksToSet(Book[] books) {
        Set<Book> result = new HashSet<>();
        Collections.addAll(result, books);
        return result;
    }
}
