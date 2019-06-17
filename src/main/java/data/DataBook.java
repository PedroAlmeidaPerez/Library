package data;

import model.Book;

import java.util.LinkedList;

public class DataBook {
    public static void dataInsert(LinkedList<Book> book){
        book.add(new Book("Luces de bohemia", "Ramón", 1998));
        book.add(new Book("Luces de bohemia", "Ramón", 1998));
        book.add(new Book("Crimen y castigo", "Fyodor", 1998));
        book.add(new Book("Las almas muertas", "Nicolai", 1998));
        book.add(new Book("Preludio a la fundación", "Fyodor", 1998));
        book.add(new Book("Crimen", "Fyodor", 1984));
        book.add(new Book("Crimen2", "Fyodor", 1998));
        book.add(new Book("Crimen3", "Fyodor", 1984));
        book.add(new Book("Crimen", "Fyodor", 1998));
        book.add(new Book("Crimen", "Fyodor", 1999));
        book.add(new Book("Crimen", "Fyodor", 2000));
        book.add(new Book("Crimen", "Fyodor", 1999));
    }
}
