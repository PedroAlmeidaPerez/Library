package utils;

import model.Book;
import model.Library;
import model.Person;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class PersonConfiguration {
    public void  addPersons (Library library){
        Scanner scanner = new Scanner(System.in);
        System.out.println("For finishing adding persons you must write exit or 0");
        while ((!(scanner.hasNext("exit"))) && (!(scanner.hasNext("0")))) {
            String name = scanner.nextLine();
            library.getPerson().add(new Person(name));

        }
        for (Person listPerson : library.getPerson()
                ) {
            System.out.println(listPerson.getName());
        }
        //return Library.getPerson();
    }

    public Person searchPerson(Library library){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the name of the Person that wants to rent the book: ");
        String name = scanner.nextLine();
        ListIterator<Person> iter = library.getPerson().listIterator();
        Person auxPerson;
        String auxName;
        while (iter.hasNext()){
            auxPerson = iter.next();
            auxName = auxPerson.getName();
            if (auxName.equals(name)){
                return auxPerson;
            }
        }
        return null;
    }
}
