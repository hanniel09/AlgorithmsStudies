package org.algorithms.collections;

import org.algorithms.collections.domain.Person;

public class Equals {
    public static void main(String[] args) {
        Person person1 = new Person("1B","Hanniel");
        Person person2 = new Person("1B","Hanniel");
//        Person person2 = person1;
//        String s1 = new String("oi");
//        String s2 = new String("oi");
//        System.out.println(s1.equals(s2));
        System.out.println(person1.equals(person2));
    }
}
