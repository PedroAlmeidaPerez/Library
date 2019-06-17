package utils;

import model.Person;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class PersonConfiguration {
    private static ArrayList<Person> listPerson = new ArrayList<>();
    public void  addPersons (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("For finishing adding persons you must write exit or 0");
        while ((!(scanner.hasNext("exit"))) && (!(scanner.hasNext("0")))) {
            System.out.println("Exit or 0 if you don't want to insert more persons");
            String name = scanner.nextLine();
            listPerson.add(new Person(name));

        }
        showPersons();
    }

    public Person searchPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the name of the Person that wants to rent the book: ");
        String name = scanner.nextLine();
        ListIterator<Person> iter = listPerson.listIterator();
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

    public void showPersons (){
        for (Person listPersons : listPerson
                ) {
            System.out.println(listPersons.getName());
        }
    }
}
