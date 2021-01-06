import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;
    Book book1;

    @Before
    public void setUp(){
        book = new Book("The Ugly Truth", "Jeff Kinney", "Fiction");
        library = new Library();
    }

    @Test
    public void bookCountStartAt0(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addBookToLibrary(){
        library.add(book);
        assertEquals(1, library.bookCount());
    }

}

