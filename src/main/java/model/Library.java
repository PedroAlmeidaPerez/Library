package model;



import utils.BookConfiguration;
import utils.PersonConfiguration;

import java.util.ArrayList;
import java.util.LinkedList;

public class Library {
   // private static ArrayList<Person> person;
    //private static LinkedList<Book> book;
    private BookConfiguration bookConfiguration;
    private PersonConfiguration personConfiguration;

    public Library() {
        bookConfiguration = new BookConfiguration();
        personConfiguration = new PersonConfiguration();
      //   book = new LinkedList();
        // person = new ArrayList();
    }

    public BookConfiguration getBookConfiguration() {
        return bookConfiguration;
    }

    public void setBookConfiguration(BookConfiguration bookConfiguration) {
        this.bookConfiguration = bookConfiguration;
    }

    public PersonConfiguration getPersonConfiguration() {
        return personConfiguration;
    }

    public void setPersonConfiguration(PersonConfiguration personConfiguration) {
        this.personConfiguration = personConfiguration;
    }
    /* public LinkedList<Book> getBook() {
        return book;
    }

    public void setBook(LinkedList<Book> book) {
        Library.book = book;
    }*/

   /* public  ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        Library.person = person;
    }
*/

}
