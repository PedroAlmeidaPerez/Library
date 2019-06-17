package model;

import utils.BookConfiguration;
import utils.PersonConfiguration;

public class Library {
    private BookConfiguration bookConfiguration;
    private PersonConfiguration personConfiguration;

    public Library() {
        bookConfiguration = new BookConfiguration();
        personConfiguration = new PersonConfiguration();
    }

    public BookConfiguration getBookConfiguration() {
        return bookConfiguration;
    }

    public void setBookConfiguration(BookConfiguration bookConfiguration) {
        this.bookConfiguration = bookConfiguration;
    }

    public PersonConfiguration getPersonConfiguration() {
        return personConfiguration;
    }

    public void setPersonConfiguration(PersonConfiguration personConfiguration) {
        this.personConfiguration = personConfiguration;
    }
}
