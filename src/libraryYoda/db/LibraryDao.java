package libraryYoda.db;

import libraryYoda.model.Book;

import java.util.List;

/**
 * Created by ivan on 14.05.16.
 */
public interface LibraryDao {

    Book createBook(Book book);
    boolean deleteBook(int bookId);
    Book find(int id);
    List<Book> all();
}
