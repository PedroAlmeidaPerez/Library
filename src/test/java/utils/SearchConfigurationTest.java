package utils;

import model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class SearchConfigurationTest {
    LinkedList<Book> listBook = new LinkedList<Book>();
    @Test
    public void testSearchBook() {
        //ID expected is 1 less because starts from 1 and not from 0
        SearchConfiguration searchConfiguration = new SearchConfiguration();
        listBook.add(new Book("Luces de bohemia", "Ramón", 1998));
        listBook.add(new Book("Luces de bohemia", "Ramón", 1998));
        listBook.add(new Book("Luces de bohemia", "Ramón", 1998));
        listBook.add(new Book("Luces de bohemia", "Ramón", 1998));
        int result = searchConfiguration.searchBook(4, listBook);
        //int result = searchConfiguration.searchBook(1, listBook);
        Assert.assertEquals(3, result);

    }
}