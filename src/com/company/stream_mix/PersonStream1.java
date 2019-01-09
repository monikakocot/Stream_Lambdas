package com.company.stream_mix;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Math.abs;

public class PersonStream1 {

    public static void main(String[] args) {

        // Statyczny import
        abs(5 - 20);

        List<String> myList = Arrays.asList("Oskar", "Pitor", "Kondzio", "Kuba");
        myList
                .stream()
                .filter(s -> s.length() > 4)
                .sorted((s,s1) -> s.compareToIgnoreCase(s1))
                .map(s -> s.toUpperCase())
                .findFirst()
                .ifPresent(s -> System.out.println(s));


        String obiekt = "AkademiaKodu jest fajna!";

        Optional<String> myOptional = Optional.ofNullable(obiekt);

        if(myOptional.isPresent()){
            System.out.println("Obiekt istnieje " + myOptional.get());
        }else {
            System.out.println("Obiekt jest nullem!!");
        }


        System.out.println("-------------------------");


        List<String> myListInteger = Arrays.asList("a124", "b14214", "g123", "o137");

        myListInteger
                .stream()
                .map(s -> s.substring(1))
                .mapToInt(Integer::valueOf)
                .map(s -> s + 100)
                .min()
                .ifPresent(System.out::println);

        long values =  IntStream
                .of(5,10,124,123)
                .sum();
        System.out.println(values);


        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Oskar", 26));
        personList.add(new Person("Piotr", 20));
        personList.add(new Person("Lukasz", 70));
        personList.add(new Person("Kuba", 14));

        String message = personList.stream()
                .filter(person -> person.getAge() >= 18)
                .map(person1 -> person1.getName())
                .collect(Collectors.joining(" i ", "Powyzej 18 lat sa: ", " ."));

        System.out.println(message);

        Double aver  = personList
                .stream()
                .collect(Collectors.averagingInt(person -> person.getAge()));

        System.out.println("Srednia wieku to: " + aver);

        IntSummaryStatistics statistics  = personList
                .stream()
                .collect(Collectors.summarizingInt(person -> person.getAge()));


        System.out.println("Statystki: " + statistics);

        List<Integer> converted =
                personList
                        .stream()
                        .map(s -> s.getAge())
                        .collect(Collectors.toList());

        // System.out.println(converted);



        List<Person> personList1 = new ArrayList<>();
        personList1.add(new Person("Oskar", 26));
        personList1.add(new Person("Oskar", 20));
        personList1.add(new Person("Lukasz", 20));
        personList1.add(new Person("Kuba", 14));

        Map<String, List<Person>> groupByAge = personList1
                .stream()
                .collect(Collectors.groupingBy(o -> o.getName()));

        // BiConsumer
        groupByAge.forEach( (key, value) -> printList(value));

        List<String> names = Arrays.asList("Katarzyna", "Oskar", "Magda", "Tomek", "Dominika", "Mateusz");


        names
                .stream()
                .map(s -> {
                    if(s.endsWith("a")){
                        return s + "(K)";
                    }else {
                        return  s + "(M)";
                    }
                }).mapToInt(s -> s.length())
                .max()
                .ifPresent(System.out::println);

        List<String> womenNames = names
                .stream()
                .filter(s -> s.endsWith("a"))
                .collect(Collectors.toList());

    }

    public static void printList(List<Person> list) {
        for(Person p : list) {
            System.out.println("Person: " + p.toString());
        }

    }

}
