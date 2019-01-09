package com.company.lambdy_.calculator.calculator_1IF;

/*
Calculator with using 1 Interface.
Methods are defined by lambdas.
 */
public class Calculator2 {
    public static void main(String[] args) {

        IntegerMathMy addition = (a,b) -> a+b;
        IntegerMathMy subtraction = (a,b) -> a-b;
        IntegerMathMy divide = (a,b) -> {
            if(b == 0){
                throw new IllegalArgumentException("DO NOT divide by zero");
            }
            return a / b;
        };
        System.out.println(addition.oparate(5,10)); //15
        System.out.println(subtraction.oparate(50,2));//48
        System.out.println(divide.oparate(100,2));//50
    }
}

