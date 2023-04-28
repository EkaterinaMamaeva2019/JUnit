import org.example.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BookTests {
    @Test
    public void test_comparison1() {

        String expected = " первая книга больше ";
        Book book1 = new Book();
        Book book2 = new Book();
        Book sut = new Book();
        book1.amount= 900; book2.amount= 800;

        String actual = sut.comparison(book1, book2);

        assertEquals(expected,actual);
    }

    @Test
    public void test_comparison2() {

        String expected = " вторая книга больше ";
        Book book1 = new Book();
        Book book2 = new Book();
        Book sut = new Book();
        book1.amount= 600; book2.amount= 800;

        String actual = sut.comparison(book1, book2);

        assertEquals(expected,actual);
    }

    @Test
    public void test_comparison3() {

        String expected = "книги равны";
        Book book1 = new Book();
        Book book2 = new Book();
        Book sut = new Book();
        book1.amount = 800;
        book2.amount = 800;

        String actual = sut.comparison(book1, book2);

        assertEquals(expected, actual);
    }

}
