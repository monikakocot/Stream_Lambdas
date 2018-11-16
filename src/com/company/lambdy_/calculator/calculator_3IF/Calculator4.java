package com.company.lambdy_.calculator.calculator_3IF;


/*
Calculator with using 1 Interfaces and 3 classes that implement it.
Every method has own class.
 */
public class Calculator4 {
    public static void main(String[] args) {

        // 1. Obiektami
        IntegerMath addition = new Addition();
        IntegerMath subtraction = new Subtraction();
        IntegerMath divide = new Divide();

        calculate(5,10,addition);
        calculate(50,2,subtraction);
        calculate(100,2,divide);

        // 2. LUB LAMBDAMI
        System.out.println("LAMBDAS");
        calculate(5,10,(a,b) -> a+b); //etc

    }

    private static void calculate (int a, int b, IntegerMath integerMath){
            System.out.println(integerMath.oparate(a,b));

    }


}
