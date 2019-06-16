package controller;

import model.Book;
import model.Library;
import utils.SearchConfiguration;
import view.Menu;
import view.SearchMenu;

import java.util.LinkedList;

public class SearchController {
    private SearchMenu searchMenu = new SearchMenu();
    private int option;
    private Menu menu;
    private LinkedList<Book> listBook;
    private SearchConfiguration searchConfiguration = new SearchConfiguration();

    public SearchController() {
        this.option = searchMenu.selectOption();
    }

    public SearchController(Menu menu, LinkedList<Book> listBook) {
        this.option = searchMenu.selectOption();
        this.menu = menu;
        this.listBook = listBook;
        searchOption();
    }

    private void searchOption(){
        //SearchConfiguration searchConfiguration = new SearchConfiguration();
        //this.option = searchMenu.selectOption();
        switch (option) {
            case 1:
                searchConfiguration.searchByTittle(listBook);
                this.option = searchMenu.selectOption();
                searchOption();
                break;
            case 2:
                searchConfiguration.searchByAuthor(listBook);
                this.option = searchMenu.selectOption();
                searchOption();
                break;
            case 3:
                searchConfiguration.searchByYear(listBook);
                this.option = searchMenu.selectOption();
                searchOption();
                break;
            case 4:
               searchConfiguration.searchByAuthorAndTittle(listBook);
                this.option = searchMenu.selectOption();
                searchOption();
                break;
            case 9:
                menu.selectOption();
                break;

             default:
                System.out.println("This option is not valid");
                this.option = searchMenu.selectOption();
                searchOption();
                break;
        }
    }
}
