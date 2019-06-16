package data;

import model.Book;
import model.Library;

public class DataBook {
    public static void dataInsert(){

        Library.getBook().add(new Book("Luces de bohemia", "Ramón", 1998));
        Library.getBook().add(new Book("Luces de bohemia", "Ramón", 1998));
        Library.getBook().add(new Book("Crimen y castigo", "Fyodor", 1998));
        Library.getBook().add(new Book("Las almas muertas", "Nicolai", 1998));
        Library.getBook().add(new Book("Preludio a la fundación", "Fyodor", 1998));
        Library.getBook().add(new Book("Crimen", "Fyodor", 1984));
        Library.getBook().add(new Book("Crimen2", "Fyodor", 1998));
        Library.getBook().add(new Book("Crimen3", "Fyodor", 1984));
        Library.getBook().add(new Book("Crimen", "Fyodor", 1998));
        Library.getBook().add(new Book("Crimen", "Fyodor", 1999));
        Library.getBook().add(new Book("Crimen", "Fyodor", 2000));
        Library.getBook().add(new Book("Crimen", "Fyodor", 1999));
    }
}
