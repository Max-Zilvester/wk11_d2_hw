import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void setUp(){
        book = new Book("The Ugly Truth", "Jeff Kinney", "Fiction");
    }

    @Test
    public void hasTitle(){
        assertEquals("The Ugly Truth", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Jeff Kinney", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Fiction", book.getGenre());
    }
}
