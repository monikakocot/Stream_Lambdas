package com.company.lambdy_sort;

import java.util.Arrays;
import java.util.Comparator;


public class LambdySortArray {

    public static void main(String[] args) {

        String[] names = {"Tomek", "Lukasz", "Kuba", "Pawel", "Hubert"};

// sort with anonymous class:

        Arrays.sort(names, new Comparator<String>() {
            @Override public int compare(String s1, String s2) {
                return (s1.compareTo(s2));
            } });

//sort with LAMBDA:

        Comparator<String> sortByName = (String s1, String s2) -> (s1.compareTo(s2));
        Arrays.sort(names, sortByName);

// or shorter version:
        Arrays.sort(names, (String s1, String s2) -> (s1.compareTo(s2)));
    }
}

