package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    @Test
    public void testGetTittle() {
        String tittle;
        Book book = new Book("juan");
        String result = book.getTittle();
        assertEquals("juan", result);
    }

}