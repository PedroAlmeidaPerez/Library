package model;

import java.util.ArrayList;
import java.util.LinkedList;

public class Library {
    private static ArrayList<Person> person;
    //private static LinkedList<Book> book;


    public Library() {
      //   book = new LinkedList();
         person = new ArrayList();
    }

   /* public LinkedList<Book> getBook() {
        return book;
    }

    public void setBook(LinkedList<Book> book) {
        Library.book = book;
    }*/

    public  ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        Library.person = person;
    }


}
