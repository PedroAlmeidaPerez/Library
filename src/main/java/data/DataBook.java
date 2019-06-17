package data;

import model.Book;

import java.util.LinkedList;

public class DataBook {
    public static void dataInsert(LinkedList<Book> listBook){
        listBook.add(new Book("Luces de bohemia", "Ramón", 1998));
        listBook.add(new Book("Luces de bohemia", "Ramón", 1998));
        listBook.add(new Book("Crimen y castigo", "Fyodor", 1998));
        listBook.add(new Book("Las almas muertas", "Nicolai", 1998));
        listBook.add(new Book("Preludio a la fundación", "Fyodor", 1998));
        listBook.add(new Book("Crimen", "Fyodor", 1984));
        listBook.add(new Book("Crimen2", "Fyodor", 1998));
        listBook.add(new Book("Crimen3", "Fyodor", 1984));
        listBook.add(new Book("Crimen", "Fyodor", 1998));
        listBook.add(new Book("Crimen", "Fyodor", 1999));
        listBook.add(new Book("Crimen", "Fyodor", 2000));
        listBook.add(new Book("Crimen", "Fyodor", 1999));
    }
}
