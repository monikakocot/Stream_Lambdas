package com.company;

import java.util.ArrayList;
import java.util.List;

    public class Employee {

        private String name;

    public Employee(String name) {
        this.name = name;
    }

    public static String getClassName(){
        return "Pracownik";
    }


    public static void main(String[] args) {


        List<Employee> employeeList = new ArrayList<>();


        Employee e = new Employee("Adam");
        Employee e1 = new Employee("Zosia");

        employeeList.add(e);
        employeeList.add(e1);

        e.name = "Wojciech";
        e1.name = "Kasia";

        System.out.println("Wypisanie LISTY IMION: ");

        for ( Employee employee2 : employeeList){
            System.out.println(employee2.name);
        }

        e=e1;
        e.name="Ola"; //nie ma znaczenia czy damy e.name = OLA czy e1.name= OLA

        System.out.println("           ");
        System.out.println("Wypisanie IMION JAKO OBIEKTÓW  po zmianie OBIEKTY SOBIE RÓWNE I DRUGIEMU OBIEKTOWI PRZYPISUJEMY IMIE 'OLA': ");

        System.out.println(e.name);
        System.out.println(e1.name);

        System.out.println("           ");
        System.out.println("Wypisanie LISTY IMION po zmianie OBIEKTY SOBIE RÓWNE I DRUGIEMU OBIEKTOWI PRZYPISUJEMY IMIE 'OLA': ");

        for ( Employee employee3 : employeeList){
            System.out.println(employee3.name);
        }

        System.out.println( );
        System.out.println("WNIOSEK: ");

        System.out.println("lista, będąca tablicą referencji, przechowuje referencję do starego obiektu 'e'");
        System.out.println("i po przepisaniu 'e=e1' obiekt 'e1' nie jest już przechowywany w liście ????");
        System.out.println("nie ma znaczenia czy damy e.name = OLA czy e1.name= OLA ");

    }


}


