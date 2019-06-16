package utils;

import model.Book;
import model.Library;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class SearchConfiguration {
    private String tittle;
    private String author;
    private int year;

    /*public void searchByTittle (Library library){
        System.out.println("Introduce a tittle to search: ");
        Scanner scanner = new Scanner(System.in);
        tittle = scanner.nextLine();
        ListIterator<Book> iter1 = library.getBook().listIterator();
        //Book auxBook = iter1.next();
        while (iter1.hasNext()){
            Book auxBook = iter1.next();
            if(auxBook.getTittle().equals(tittle)){
                System.out.println(auxBook.getId() + " " + auxBook.getTittle() + " " + auxBook.getAuthor() + " " + auxBook.getYear() + " " + auxBook.getStatus());
            }
            //auxBook = iter1.next();
        }
    }

    public void searchByAuthor(Library library) {
        System.out.println("Introduce the Author to search: ");
        Scanner scanner = new Scanner(System.in);
        author = scanner.nextLine();
        ListIterator<Book> iter1 = library.getBook().listIterator();
        //Book auxAuthor = iter1.next();
        while (iter1.hasNext()){
            Book auxAuthor = iter1.next();
            if(auxAuthor.getAuthor().equals(author)){
                System.out.println(auxAuthor.getId() + " " + auxAuthor.getTittle() + " " + auxAuthor.getAuthor() + " " + auxAuthor.getYear() + " " + auxAuthor.getStatus());
            }
          //  auxAuthor = iter1.next();
        }
    }

    public void searchByYear(Library library) {
        System.out.println("Introduce the year to search: ");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        ListIterator<Book> iter1 = library.getBook().listIterator();
        //Book auxYear = iter1.next();
        while (iter1.hasNext()){
            Book auxYear = iter1.next();
            if(auxYear.getYear() == (year)){
                System.out.println(auxYear.getId() + " " + auxYear.getTittle() + " " + auxYear.getAuthor() + " " + auxYear.getYear() + " " + auxYear.getStatus());
            }
          //  auxYear = iter1.next();
        }
    }

    public void searchByAuthorAndTittle(Library library) {
        boolean found=false;
        Scanner scannAuthor = new Scanner(System.in);
        Scanner sccannTittle = new Scanner(System.in);
        System.out.println("search by Author and Tittle");
        System.out.println("Introduce a tittle to search: ");
        tittle = sccannTittle.nextLine();
        System.out.println("Introduce the Author to search: ");
        author = scannAuthor.nextLine();
        ListIterator<Book> iter1 = library.getBook().listIterator();
        //Book book = iter1.next();
        while (iter1.hasNext()){
            Book book = iter1.next();
            if((book.getAuthor().equals(author)) && (book.getTittle().equals(tittle))){
                book.showBook(book);
                found = true;
            }
           // book = iter1.next();
        }
        if(!found){
            System.out.println("book not found");
        }
    }
*/
    public static int searchBook(int Id, LinkedList<Book> book){
        Scanner scanner = new Scanner(System.in);
        ListIterator<Book> iter1 = book.listIterator();
        while (iter1.hasNext()){
            int auxId = iter1.next().getId();
            if(auxId == Id){
                System.out.println("si esta");
                return iter1.nextIndex()-1;
            }
        }
        return -1;
    }
}
