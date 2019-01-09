package com.company.lambdy_list;

import java.util.ArrayList;
import java.util.List;

/*
Excercise with using lambdas for methamatical actions on the elements of list.
 */
public class Lista {

    public static void main(String[] args) {

        List <Integer> elements = new ArrayList();
        elements.add(5);
        elements.add(10);
        elements.add(20);

        MyArray.map(elements,(a)->a+5);
    }
}
class MyArray {
    public static void map(List<Integer> list, AddInterface addInterface) {
        for (int i = 0; i < list.size(); i++) {
             int a= list.get(i);
            System.out.println(addInterface.oparate(a));
        }
    }
}