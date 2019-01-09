package com.company.stream_group;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Exrcercise with groping elements from  the list.
 */
public class MainCompany {

    public static void main(String[] args) {

    List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Lukasz", "Kolacz", "ArtaTech"));
        employeeList.add(new Employee("Adam", "Kaczmarek", "Akademia Kodu"));
        employeeList.add(new Employee("Oskar", "Reily", "Helicon"));
        employeeList.add(new Employee("Gniewomir", "Nurkowski", "SpecShop"));
        employeeList.add(new Employee("Viktor", "Rammstein", "ArtaTech"));
        employeeList.add(new Employee("Michal", "Makaruk", "Akademia Kodu"));

    Map<String, List<Employee>> groupByCompany;
        groupByCompany = employeeList
                .stream()
                .collect(Collectors.groupingBy((Employee e)->e.getCompany()));

        groupByCompany.forEach((company, e) ->
            System.out.println(e.toString()));

    }
}
