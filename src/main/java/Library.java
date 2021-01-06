import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private Book book;
    private Library library;

    public Library(){
        this.books = new ArrayList<Book>();

    }

    public ArrayList<Book>  getBooks(){
        return books;
    }

    public int bookCount() {
        return this.books.size();
    }


    public void add(Book book) {
        this.books.add(book);
    }
}
