package com.company.lambdy_sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class LambdySortCollections {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tomek", "Lukasz", "Kuba", "Pawel", "Hubert");

// sort with anonymous class:
        Collections.sort(names, new Comparator<String>() {
            @Override public int compare(String s1, String s2) {
                return (s1.compareTo(s2));
            } });

// sort with LAMBDA:
        Collections.sort(names, (arg1, arg2) -> arg1.compareToIgnoreCase(arg2));
        names.forEach((arg1) -> System.out.println(arg1));

    }
}
