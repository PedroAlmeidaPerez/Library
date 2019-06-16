package utils;

import data.DataBook;
import model.Book;
import model.Library;
import model.Person;

import java.util.ListIterator;
import java.util.Scanner;

public class BookConfiguration {

    private Scanner scanner = new Scanner(System.in);

    public void addBook (Library library){
        String option;
      //  Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to fill the collection automatically? Y/N");
        option  = scanner.nextLine();
        if(option.equals("N")){
            System.out.println("For finishing adding books you must write exit or 0");
            while ((!(scanner.hasNext("exit"))) && (!(scanner.hasNext("0")))) {
                String tittle = scanner.nextLine();
                library.getBook().add(new Book(tittle));
            }
        }else{
            DataBook.dataInsert(library);
        }
        Book.showBooks(library);
    }

    public void deleteBook(Library library){
       // Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the ID from the book that you want to delete: ");
        int Id = scanner.nextInt();
        ListIterator<Book> iter = library.getBook().listIterator();
        int ind = SearchConfiguration.searchBook(Id, library);
        Book book = library.getBook().get(ind);
        if(!book.getStatus()){
            System.out.println("si esta");
            for (int i = 0; i <= ind; i++){
                iter.next();
            }
            iter.remove();
        }else{
            if (book.getStatus()){
                System.out.println(("Can not be deleted because the book is lent by: ") + book.getLent() + " " + book.getIdLent());
            }else{
                System.out.println("no esta");
            }
        }
    }

    public void  lentBook(Person person, Library library){
        if (person != null){
            //ListIterator<Book> iter1 = Library.getBook().listIterator();
            //Scanner scanner = new Scanner(System.in);
            System.out.println("Which book do you want to rent (by Id)?");
            Book.showBooks(library);
            int Id = scanner.nextInt();
            int ind = SearchConfiguration.searchBook(Id, library);
            Book book = library.getBook().get(ind);
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
        }else{
            System.out.println("This Client does not exist");
        }
    }

    public void booksAvailable (Library library){
        int countAvailable=0;
        int countNoAvailable=0;
        for (Book listBooks: library.getBook()
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
}
