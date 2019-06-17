package controller;

import model.Library;
import model.Person;
import utils.BookConfiguration;
import view.Menu;

public class LibraryController {
    private Menu menu = new Menu();
    private int option;
    private Library library;

    public LibraryController() {
        library = new Library();
        this.option = menu.selectOption();
        mainMenu();
    }

    private void mainMenu() {

        switch (option) {
            case 1:
                library.getPersonConfiguration().addPersons();
                this.option = menu.selectOption();
                mainMenu();
                break;
            case 2:
                library.getBookConfiguration().addBook();
                this.option = menu.selectOption();
                mainMenu();
                break;
            case 3:
                library.getBookConfiguration().deleteBook();
                this.option = menu.selectOption();
                mainMenu();
                break;
            case 4:
                Person person;
                person = library.getPersonConfiguration().searchPerson();
                library.getBookConfiguration().lentBook(person);
                this.option = menu.selectOption();
                mainMenu();
                break;
            case 5:
                library.getBookConfiguration().booksAvailable();
                this.option = menu.selectOption();
                mainMenu();
                break;
            case 6:
                SearchController searchController = new SearchController(menu, BookConfiguration.getBookList());
                break;
            case 0:
                break;
            default:
                System.out.println("This option is not valid");
                this.option = menu.selectOption();
                mainMenu();
                break;
        }
    }
}