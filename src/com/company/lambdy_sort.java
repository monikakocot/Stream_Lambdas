package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class lambdy_sort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tomek", "Lukasz", "Kuba", "Pawel", "Hubert");

        Collections.sort(names, (arg1, arg2) -> arg1.compareToIgnoreCase(arg2));

        Consumer consumer;
        names.forEach((arg1) -> System.out.println(arg1));

    }
}
