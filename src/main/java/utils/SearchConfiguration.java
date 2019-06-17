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
            Book book = iter1.next();
            if(book.getTittle().equals(tittle)){
                book.showBook(book);
            }
        }
    }

    public void searchByAuthor(LinkedList<Book> listBook) {
        System.out.println("Introduce the Author to search: ");
        Scanner scanner = new Scanner(System.in);
        author = scanner.nextLine();
        ListIterator<Book> iter1 = listBook.listIterator();
        while (iter1.hasNext()){
            Book book = iter1.next();
            if(book.getAuthor().equals(author)){
                book.showBook(book);
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
                Book book = iter1.next();
                if(book.getYear() == (year)){
                    book.showBook(book);
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

    public int searchBook(int Id, LinkedList<Book> book){
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