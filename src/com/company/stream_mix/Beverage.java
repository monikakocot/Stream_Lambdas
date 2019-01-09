package com.company.stream_mix;

import java.util.*;
import java.util.stream.Collectors;

public class Beverage {

    String name;
    int price;

    public Beverage(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //GETTERS, SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

    List<Beverage> beverages = Arrays.asList
            ( new Beverage("Cola", 2),
                    new Beverage("HipsterCola", 5),
                    new Beverage("SuperHipsterCola", 5),
                    new Beverage("UltraSuperHipsterCola", 10),
                    new Beverage("CheapCola", 2));

    System.out.println("Drink started with 'C': ");
    List<Beverage> filtred = beverages
            .stream()
            .filter(b->b.name.startsWith("C"))
            .collect(Collectors.toList());

            System.out.println(filtred); // [Cola, CheapCola]

    System.out.println("Drink grouping with prices: ");

        Map<Integer, List<Beverage>> colaByPrice = beverages
                .stream()
                .collect(Collectors.groupingBy(b -> b.price));

        colaByPrice.forEach((price, p) -> System.out.format("price %s: %s\n",price, p));
        // price 2: [Cola, CheapCola]
        // price 5: [HipsterCola, SuperHipsterCola]
        // price 10: [UltraSuperHipsterCola]

    System.out.println("Average price of drinks: ");
        Double averagePrice = beverages
                .stream()
                .collect(Collectors.averagingInt(b -> b.price));

        System.out.println(averagePrice); //4.8

    System.out.println("Adding discounts for drinks with price >2: ");
        String specialOffer = beverages
                .stream()
                .filter(b -> b.price >2)
                .map(b -> b.name)
                .collect(Collectors.joining(" and ", "Special offer:", "are -20%."));

        System.out.println(specialOffer); //Special Offer: HipsterCola and SuperHipsterCola and UltraSuperHipsterCola are -20%.
    }
}