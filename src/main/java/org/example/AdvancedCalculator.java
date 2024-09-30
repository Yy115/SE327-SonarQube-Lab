package org.example;

public class AdvancedCalculator {
    public double power(int base, int exponent){
        return Math.pow(base, exponent);
    }

    public double sqrt(int a) throws IllegalAccessException {
        if (a < 0){
            throw new IllegalAccessException("Cannot calculate square root of negative number.");
        }
        return Math.sqrt(a);
    }
}
