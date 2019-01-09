package com.company.lambdy_sort.sortListPeople;

import java.util.*;

public class PersonSort {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<Person>();
        people.add(new Person('K', "Asia", "Wczorajsza"));
        people.add(new Person('M', "Marcin", "Nikczemny"));
        people.add(new Person('M', "Slawek", "Abacki"));
        people.add(new Person('K', "Kasia", "Borowik"));
        people.add(new Person('K', "Dorota", "Borowik"));
        people.add(new Person('M', "Tomek", "Daszek"));
        people.add(new Person('K', "Ania", "Daszek"));

        System.out.println("NOT SORTED: ");
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println("SORTED BY SURNAME: ");
        Collections.sort(people);
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("COMPARATOR NAME: ");
        System.out.println("SORTED BY NAME ");
        // sort with LAMBDA:
        Collections.sort(people, (arg1, arg2) ->
                {
                    int name = (arg1.name).compareTo(arg2.name);
                    if (name == 0) {
                        return arg1.compareTo(arg2);
                    }
                    return name;
                }
        );

        people.forEach((arg1) -> System.out.println(arg1));
    }
}
