package controller;

import model.Book;
import model.Library;
import model.Person;
import utils.BookConfiguration;
import utils.PersonConfiguration;
import utils.SearchConfiguration;
import view.Menu;
import view.SearchMenu;

import java.util.Scanner;

public class LibraryController {
    private Menu menu = new Menu();
    private int option;
   // private SearchMenu searchMenu = new SearchMenu();
    BookConfiguration bookConfiguration = new BookConfiguration();

    //private Library library;
    //private PersonConfiguration personConfiguration;
    private Library library = new Library();
    private PersonConfiguration personConfiguration = new PersonConfiguration();

    public LibraryController() {
        this.library = library;
        this.personConfiguration = personConfiguration;
        this.option = menu.selectOption();
        mainMenu();
    }

    private void mainMenu() {

        switch (option) {
            case 1:
                System.out.println("estas en la opcion 1");
                personConfiguration.addPersons(library);
                this.option = menu.selectOption();
                mainMenu();
                break;
            case 2:

                System.out.println("estas en la opcion 2");
                bookConfiguration.addBook(library);
                //BookConfiguration.addBook();
                this.option = menu.selectOption();
                mainMenu();
                break;
            case 3:
                System.out.println("Estas en la opcion 3");
                bookConfiguration.deleteBook(library);
                //BookConfiguration.deleteBook();
                this.option = menu.selectOption();
                mainMenu();
                break;
            case 4:
                Person person;
                System.out.println("Estas en la opcion 4");
                person = personConfiguration.searchPerson(library);
                bookConfiguration.lentBook(person);
                //BookConfiguration.lentBook(person);
                this.option = menu.selectOption();
                mainMenu();
                break;

            case 5:
                Book.showBooks();
                bookConfiguration.booksAvailable(library);
                //BookConfiguration.booksAvailable();
                this.option = menu.selectOption();
                mainMenu();
                break;
            case 6:
                SearchController searchController = new SearchController(menu);
                break;
                //searchMenu();
            case 0:
                break;
            default:
                System.out.println("This option is not valid");
                this.option = menu.selectOption();
                mainMenu();
                break;
        }
    }
    


    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }
}