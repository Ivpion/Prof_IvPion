package libraryYoda.db;


import libraryYoda.model.Book;
import libraryYoda.model.Reader;

import java.util.*;

/**
 * Created by ivan on 14.05.16.
 */
public class AppOB {

    private Map<Reader, List<Book>> readerBook;
    private Set<Reader>  blackList;
    private List<Book> freeBooks;

    public AppOB() {
        readerBook = new TreeMap<>();
        blackList = new HashSet<>();
        freeBooks = new ArrayList<>();
    }

    public Map<Reader, List<Book>> getReaderBook() {
        return readerBook;
    }

    public void setReaderBook(Map<Reader, List<Book>> readerBook) {
        this.readerBook = readerBook;
    }

    public Set<Reader> getBlackList() {
        return blackList;
    }

    public void setBlackList(Set<Reader> blackList) {
        this.blackList = blackList;
    }

    public List<Book> getFreeBooks() {
        return freeBooks;
    }

    public void setFreeBooks(List<Book> freeBooks) {
        this.freeBooks = freeBooks;
    }
}
