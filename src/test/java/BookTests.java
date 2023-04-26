import org.example.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class BookTests {
    @Test
    public void comparison1() {
        Book book1 = new Book();
        Book book2 = new Book();
        Book sut = new Book();
        book1.amount= 900; book2.amount= 800;
        boolean expected = book1.amount > book2.amount;

        boolean actual = Boolean.parseBoolean(sut.comparison(book1, book2));

        assertTrue(actual);
    }

    @Test
    public void comparison2() {
        Book book1 = new Book();
        Book book2 = new Book();
        Book sut = new Book();
        book1.amount= 600; book2.amount= 800;
        boolean expected = book1.amount < book2.amount;

        boolean actual = Boolean.parseBoolean(sut.comparison(book1, book2));

        assertTrue(actual);
    }

    @Test
    public void comparison3() {
        Book book1 = new Book();
        Book book2 = new Book();
        Book sut = new Book();
        book1.amount= 800; book2.amount= 800;
        int expected = book1.amount = book2.amount;

        boolean actual = Boolean.parseBoolean(sut.comparison(book1, book2));

        assertTrue(actual);
    }
}
