package libraryYoda.controller;

import libraryYoda.exception.LibraryException;
import libraryYoda.exception.NoUserFoundException;
import libraryYoda.model.Book;
import libraryYoda.model.Reader;


import java.util.Date;
import java.util.List;

/**
 * Created by ivan on 14.05.16.
 */
public interface LibraryController {

    List<Reader> getReaders();
    List<Book> getAviableBooks();
    boolean addBook(Book book);
    boolean addReader (Reader reader);
    boolean giveBookToReader(int bookId, int readerId) throws LibraryException;
    List<Book> getReadersBook();
    List<Book> getReaderBooks(int readerId) throws NoUserFoundException;
    boolean addToBlackList(int readerId) throws NoUserFoundException;
    List<Book> search (String author);
    List<Book> search (Date from, Date to);
}
