package com.company.lambdy_sort.sortListPeople;

public class Person implements Comparable<Person>{

    private char gender;
    public  String name;
    private String surname;

    public Person(char gender, String name, String surname) {
        this.gender = gender;
        this.name = name;
        this.surname = surname;
    }
    @Override
    public String toString() {
        return "Person{" +
                "gender=" + gender +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
    @Override
    public int compareTo(Person o) {
        int compareSurname = surname.compareTo(o.surname);

        if(compareSurname  == 0) {
            return name.compareTo(o.name);
        }
        else {
            return compareSurname ;
        }
    }
}
