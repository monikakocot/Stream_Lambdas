package com.company.lambdy_sort.sortListPlayer;

import java.util.Arrays;
import java.util.Comparator;

public class Players {

    public static void main(String[] args) {

        String[] players = {"Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer", "Andy Murray", "Tomas Berdych", "Juan Martin Del Potro", "Richard Gasquet", "John Isner"};

// Sort players by name using anonymous innerclass
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.compareTo(s2));
            }
        });

// Sort players by name using lambda expression:

        Comparator<String> sortByName = (String s1, String s2) -> (s1.compareTo(s2));
        Arrays.sort(players, sortByName);
// or this
        Arrays.sort(players, (String s1, String s2) -> (s1.compareTo(s2)));

// Sort players by surname using anonymous innerclass
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.substring(s1.indexOf(" ")).compareTo(s2.substring(s2.indexOf(" "))));
            }
        });

// Sort players by surname using lambda expression
        Comparator<String> sortBySurname = (String s1, String s2) -> (s1.substring(s1.indexOf(" ")).compareTo(s2.substring(s2.indexOf(" "))));
        Arrays.sort(players, sortBySurname);

// or this
        Arrays.sort(players, (String s1, String s2) -> (s1.substring(s1.indexOf(" ")).compareTo(s2.substring(s2.indexOf(" ")))));

// Sort players by name lenght using anonymous innerclass
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.length() - s2.length());
            }
        });

// Sort players by name lenght using lambda expression
        Comparator<String> sortByNameLenght = (String s1, String s2) -> (s1.length() - s2.length());

        Arrays.sort(players, sortByNameLenght);
// or this
        Arrays.sort(players, (String s1, String s2) -> (s1.length() - s2.length()));

// Sort players by last letter using anonymous innerclass
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1));
            }
        });

// Sort players by last letter using lambda expression
        Comparator<String> sortByLastLetter = (String s1, String s2) -> (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1));
        Arrays.sort(players, sortByLastLetter);
// or this
        Arrays.sort(players, (String s1, String s2) -> (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1)));
    }
}
