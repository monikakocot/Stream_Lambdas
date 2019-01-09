package com.company.lambdy_sort.sortListPeople;

import java.util.*;

public class CzlowiekSort {

    public static void main(String[] args) {

        List<Czlowiek> ludzie = new ArrayList<Czlowiek>();
        ludzie.add(new Czlowiek('K', "Asia", "Wczorajsza"));
        ludzie.add(new Czlowiek('M', "Marcin", "Nikczemny"));
        ludzie.add(new Czlowiek('M', "Slawek", "Abacki"));
        ludzie.add(new Czlowiek('K', "Kasia", "Borowik"));
        ludzie.add(new Czlowiek('K', "Dorota", "Borowik"));
        ludzie.add(new Czlowiek('M', "Tomek", "Daszek"));
        ludzie.add(new Czlowiek('K', "Ania", "Daszek"));

        System.out.println("Nieposortowanie: ");
        for (Czlowiek czlowiek : ludzie) {
            System.out.println(czlowiek);
        }
        System.out.println("Posortowane po nazwisku: ");
        Collections.sort(ludzie);
        for (Czlowiek czlowiek : ludzie) {
            System.out.println(czlowiek);
        }

        System.out.println("COMPARATOR NAME: ");
        System.out.println("Posortowane po imieniu: ");
        // sort with LAMBDA:
        Collections.sort(ludzie, (arg1, arg2) ->
                {
                    int imie = (arg1.imie).compareTo(arg2.imie);
                    if (imie == 0) {
                        return arg1.compareTo(arg2);
                    }
                    return imie;
                }
        );

        ludzie.forEach((arg1) -> System.out.println(arg1));

    }
}
