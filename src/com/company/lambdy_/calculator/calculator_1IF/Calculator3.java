package com.company.lambdy_.calculator.calculator_1IF;

/*
Calculator with  using 1 Interface.
Methods are defined by lambds.
 */
public class Calculator3 {
    public static void main(String[] args) {

        System.out.println(operateBinary(5, 10, (a,b) ->   a + b));
        System.out.println(operateBinary(80, 40, (a,b) ->   a - b));
        System.out.println(operateBinary(100, 2, (a,b) -> {
            if(b == 0){
                throw new IllegalArgumentException("DO NOT divide by zero");
            }
            return a / b;
        }));
    }

    public static int operateBinary(int a, int b, IntegerMathMy integerMathMy){
        return integerMathMy.oparate(a,b);
    }
}


