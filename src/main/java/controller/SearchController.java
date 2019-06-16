package controller;

import model.Library;
import utils.SearchConfiguration;
import view.Menu;
import view.SearchMenu;

public class SearchController {
    private SearchMenu searchMenu = new SearchMenu();
    private int option;
    private Menu menu;
    private Library library;
    private SearchConfiguration searchConfiguration = new SearchConfiguration();

    public SearchController() {
        this.option = searchMenu.selectOption();
    }

    public SearchController(Menu menu, Library library) {
        this.option = searchMenu.selectOption();
        this.menu = menu;
        this.library = library;
        searchOption();
    }

    private void searchOption(){
        //SearchConfiguration searchConfiguration = new SearchConfiguration();
        //this.option = searchMenu.selectOption();
        switch (option) {
            case 1:
                searchConfiguration.searchByTittle(library);
                this.option = searchMenu.selectOption();
                searchOption();
                break;
            case 2:
                searchConfiguration.searchByAuthor(library);
                this.option = searchMenu.selectOption();
                searchOption();
                break;
            case 3:
                searchConfiguration.searchByYear(library);
                this.option = searchMenu.selectOption();
                searchOption();
                break;
            case 4:
                searchConfiguration.searchByAuthorAndTittle(library);
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
