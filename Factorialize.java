package com.company;

public class Factorialize {

    public static double factorialize(int input) {
        double total = 1;

        if (input != 0) {
            for (int i = 1; i <= input; i++) {
                total *= i;
            }
        }

        return total;
    }
}
