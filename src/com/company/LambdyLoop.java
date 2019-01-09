package com.company;

import java.util.Arrays;
import java.util.List;

public class LambdyLoop {


    public static void main(String[] args) {

        String[] students = {"Adam", "Maciek", "Ela", "Aga", "Rafał", "Magda", "Ania"};
        List<String> studentList = Arrays.asList(students);

//System.out.println():
        System.out.println(studentList);

// Traditional loop:

        for (String student : studentList) {
            System.out.print(student + "; ");
        }

// Lambda:

        studentList.forEach((student) -> System.out.print(student + "; "));

// with ::
        studentList.forEach(System.out::println);
    }
}
