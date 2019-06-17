package utils;

import data.DataBook;
import model.Book;
import model.Person;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.stream.Collectors;

import static utils.DistincByKey.distinctByKey;

public class BookConfiguration {

    private static LinkedList<Book> bookList = new LinkedList<Book>();
   // private Scanner scanner = new Scanner(System.in);

    public void addBook (){
        String option;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to fill the collection automatically? Y/N");
        option  = scanner.nextLine();
        if(option.equals("N")){
            System.out.println("For finishing adding books you must write exit or 0");
            while ((!(scanner.hasNext("exit"))) && (!(scanner.hasNext("0")))) {
                String tittle = scanner.nextLine();
                bookList.add(new Book(tittle));
            }
        }else{
            DataBook.dataInsert(bookList);
        }
        showBooks(bookList);

    }

    public void deleteBook(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the ID from the book that you want to delete: ");
        int Id = scanner.nextInt();
        ListIterator<Book> iter = bookList.listIterator();
        int ind = SearchConfiguration.searchBook(Id, bookList);
        if (ind == -1){
            System.out.println("No book with this ID");
        }else{
            Book book = bookList.get(ind);
            if(!book.getStatus()){
                System.out.println("si esta");
                for (int i = 0; i <= ind; i++){
                    iter.next();
                }
                iter.remove();
                scanner.reset();
            }else{
                if (book.getStatus()){
                    System.out.println(("Can not be deleted because the book is lent by: ") + book.getLent() + " " + book.getIdLent());
                }else{
                    System.out.println("no esta");
                }
            }
        }
    }

    public void  lentBook(Person person){
        if (person != null){

            //ListIterator<Book> iter1 = Library.getBook().listIterator();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Which book do you want to rent (by Id)?");
            showBooks(bookList);
            int Id = scanner.nextInt();
            int ind = SearchConfiguration.searchBook(Id, bookList);
            if (ind == -1){
                System.out.println("No book with this ID");
            }else{
                Book book = bookList.get(ind);
                book.showBook(book);
                if (book.getStatus()){
                    System.out.println("Sorry but this book is lent by: " + book.getLent());
                }else{
                    book.setStatus(true);
                    book.setLent(person.getName());
                    book.setIdLent(person.getId());
                    person.setIdBook(book.getId());
                    System.out.println(("You have lent the book: ") + book.getTittle());
                }
            }

        }else{
            System.out.println("This Client does not exist");
        }
    }

    public void booksAvailable (){
        int countAvailable=0;
        int countNoAvailable=0;
        showBooks(bookList);
        List<Book> distinctElements = bookList.stream()
                .filter( distinctByKey(p -> p.getTittle()) )
                .collect( Collectors.toList() );
        System.out.println("-----------------------------------");
        System.out.println(distinctElements);
        System.out.println("-----------------------------------");




        for (Book listBooks: bookList
             ) {
            if (listBooks.getStatus()){
                countNoAvailable++;
            }else{
                countAvailable++;
            }
        }
        System.out.println("Number of books available: " + countAvailable);
        System.out.println("Number of books not available: " + countNoAvailable);
    }

    public static LinkedList<Book> getBookList() {
        return bookList;
    }

    public void showBooks(LinkedList <Book> book) {
        // System.out.println("Id     Tittle              Author                  Year            Status");
        for (Book listBook : book
                ) {
            System.out.print("Id: " + listBook.getId() +
                    " Tittle: " + listBook.getTittle() +
                    " Author: " + listBook.getAuthor() +
                    " Year: " + listBook.getYear() +
                    " Status: ");

            if (listBook.getStatus()) {
                System.out.println("lent");
            } else {
                System.out.println("not lent");
            }

        }
    }
}

