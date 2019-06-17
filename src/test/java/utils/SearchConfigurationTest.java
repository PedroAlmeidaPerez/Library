package utils;

import model.Book;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class SearchConfigurationTest {
    LinkedList<Book> listBook = new LinkedList<Book>();
    @Test
    public void testSearchBook() {
        SearchConfiguration searchConfiguration = new SearchConfiguration();
        listBook.add(new Book("Luces de bohemia", "Ramón", 1998));
        searchConfiguration.searchBook(1, listBook);

    }
}