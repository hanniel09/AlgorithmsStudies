package org.algorithms.collections;

import org.algorithms.collections.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonListTest01 {
    public static void main(String[] args) {
        Person p1 = new Person("01", "Hanniel");
        Person p2 = new Person("02", "Loiane");
        Person p3 = new Person("03", "Elder");

        List<Person> persons = new ArrayList<>(6);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        for(Person person: persons){
            System.out.println(person);
        }

        Person p4 = new Person("02", "Loiane");
        System.out.println(persons.contains(p4));
        int indexPerson4 = persons.indexOf(p4);
        System.out.println(indexPerson4);
    }
}
