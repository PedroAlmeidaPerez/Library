package data;

import model.Book;
import model.Library;

public class DataBook {
    public static void dataInsert(Library library){

        library.getBook().add(new Book("Luces de bohemia", "Ramón", 1998));
        library.getBook().add(new Book("Luces de bohemia", "Ramón", 1998));
        library.getBook().add(new Book("Crimen y castigo", "Fyodor", 1998));
        library.getBook().add(new Book("Las almas muertas", "Nicolai", 1998));
        library.getBook().add(new Book("Preludio a la fundación", "Fyodor", 1998));
        library.getBook().add(new Book("Crimen", "Fyodor", 1984));
        library.getBook().add(new Book("Crimen2", "Fyodor", 1998));
        library.getBook().add(new Book("Crimen3", "Fyodor", 1984));
        library.getBook().add(new Book("Crimen", "Fyodor", 1998));
        library.getBook().add(new Book("Crimen", "Fyodor", 1999));
        library.getBook().add(new Book("Crimen", "Fyodor", 2000));
        library.getBook().add(new Book("Crimen", "Fyodor", 1999));
    }
}
