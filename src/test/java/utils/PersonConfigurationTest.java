package utils;

import model.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PersonConfigurationTest {
    private static ArrayList<Person> listPerson = new ArrayList<Person>();
    @Test
    public void testSize_AddPersons() {
        /*listPerson.add(new Person("pedro"));*/
        PersonConfiguration personConfiguration = new PersonConfiguration();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        personConfiguration.addPersons();
        int result = 1;
        Assert.assertEquals(result,listPerson.size() );
    }

    @Test
    public void testGetOneElementPerson() {
        Person person;
        listPerson.add(new Person("pablo")); //get(0)
        listPerson.add(new Person("pedro")); //get(1)
        listPerson.add(new Person("juan")); //get(2)
        person = listPerson.get(2);
        String result = person.getName();
        Assert.assertEquals(result, "pedro");
    }
}