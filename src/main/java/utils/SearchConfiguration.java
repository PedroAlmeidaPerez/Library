package utils;

import model.Book;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class SearchConfiguration {
    private String tittle;
    private String author;
    private int year;

    public void searchByTittle (LinkedList<Book> listBook){
        System.out.println("Introduce a tittle to search: ");
        Scanner scanner = new Scanner(System.in);
        tittle = scanner.nextLine();
        ListIterator<Book> iter1 = listBook.listIterator();
        while (iter1.hasNext()){
            Book auxBook = iter1.next();
            if(auxBook.getTittle().equals(tittle)){
                System.out.println(auxBook.getId() + " " + auxBook.getTittle() + " " + auxBook.getAuthor() + " " + auxBook.getYear() + " " + auxBook.getStatus());
            }
        }
    }

    public void searchByAuthor(LinkedList<Book> listBook) {
        System.out.println("Introduce the Author to search: ");
        Scanner scanner = new Scanner(System.in);
        author = scanner.nextLine();
        ListIterator<Book> iter1 = listBook.listIterator();
        while (iter1.hasNext()){
            Book auxAuthor = iter1.next();
            if(auxAuthor.getAuthor().equals(author)){
                System.out.println(auxAuthor.getId() + " " + auxAuthor.getTittle() + " " + auxAuthor.getAuthor() + " " + auxAuthor.getYear() + " " + auxAuthor.getStatus());
            }
        }
    }

    public void searchByYear(LinkedList<Book> listBook) {
        System.out.println("Introduce the year to search: ");
        Scanner scanner = new Scanner(System.in);
        try{
            year = scanner.nextInt();
            ListIterator<Book> iter1 = listBook.listIterator();
            while (iter1.hasNext()){
                Book auxYear = iter1.next();
                if(auxYear.getYear() == (year)){
                    System.out.println(auxYear.getId() + " " + auxYear.getTittle() + " " + auxYear.getAuthor() + " " + auxYear.getYear() + " " + auxYear.getStatus());
                }
            }

        }catch (Exception e){
            System.out.println("You are not typing a year");
        }

    }

    public void searchByAuthorAndTittle(LinkedList<Book> listBook) {
        boolean found=false;
        Scanner scannAuthor = new Scanner(System.in);
        Scanner sccannTittle = new Scanner(System.in);
        System.out.println("search by Author and Tittle");
        System.out.println("Introduce a tittle to search: ");
        tittle = sccannTittle.nextLine();
        System.out.println("Introduce the Author to search: ");
        author = scannAuthor.nextLine();
        ListIterator<Book> iter1 = listBook.listIterator();
        while (iter1.hasNext()){
            Book book = iter1.next();
            if((book.getAuthor().equals(author)) && (book.getTittle().equals(tittle))){
                book.showBook(book);
                found = true;
            }
        }
        if(!found){
            System.out.println("book not found");
        }
    }

    public static int searchBook(int Id, LinkedList<Book> book){
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
