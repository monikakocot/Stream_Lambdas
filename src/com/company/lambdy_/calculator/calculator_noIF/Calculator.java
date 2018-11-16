package com.company.lambdy_.calculator.calculator_noIF;

import java.util.function.BiFunction;

/*
Calculator without using Interface.
Funcions are defined by static methods and lambds.
 */
public class Calculator {
    public static void main(String[] args) {

        System.out.println(operateBinary(5, 10, (a,b) ->   a + b)); //15
        System.out.println(operateBinary(80, 40, (a,b) ->   a - b));

        System.out.println(operateBinary(100, 2, (a,b) -> {
            if(b == 0){
                throw new IllegalArgumentException("Nie dziel cholero przez zero");
            }
            return a / b;
        }));
    }


    public static int operateBinary(int a, int b, BiFunction<Integer, Integer, Integer> math){
        return math.apply(a,b);
    }


}

