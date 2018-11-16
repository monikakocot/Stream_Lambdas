package com.company.lambdy_.calculator.calculator_3IF;

public class Divide implements IntegerMath {
    @Override
    public int oparate(int a, int b) {
            if(b == 0){
                throw new IllegalArgumentException("DO NOT divide by zero");
            }
            return a / b;
        }
}
