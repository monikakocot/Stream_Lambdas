package com.company.stram_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Excercise with corversion of the List<Company> to List<String>
- conversion the list of Company objects to the list of the names of the company's city.
 */

public class MainMap {

    public static void main(String[] args) {

///////////////////////////////////////
        System.out.println("Example 1: ");

        List<Company> companies = new ArrayList<>();
        companies.add(new Company("Nokia","Warszawa"));
        companies.add(new Company("ABB","Kraków"));
        companies.add(new Company("IBM","Katowice"));
        companies.add(new Company("Comarch","Katowice"));

        List<String> list = new ArrayList<>();
        list = companies
                .stream()
                .map(c-> c.city)
                .collect(Collectors.toList());

        System.out.println(list);

///////////////////////////////////////
        System.out.println("Example 2: ");

        List fruits = Arrays.asList("apple", "banana", "cherry", "plum", "pear", "pinapple");

        fruits.stream()
                .filter(s -> s.toString().startsWith("p"))
                .map(s -> s.toString().toUpperCase())
                .sorted()
                .forEach(System.out::println);

    }
}
