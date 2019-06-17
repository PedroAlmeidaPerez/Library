package utils;

import model.Book;
import model.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PersonConfigurationTest {
    private static ArrayList<Person> listPerson = new ArrayList<Person>();
    @Test
    public void addPersons() {
        listPerson.add(new Person("Ramón"));
        int result = 1;
        Assert.assertEquals(result,listPerson.size() );
    }

    @Test
    public void searchPerson() {
    }
}