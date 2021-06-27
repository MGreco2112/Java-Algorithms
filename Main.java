package com.company;

@SuppressWarnings("ALL")

public class Main {

    public static double convertToFarenheit(int celsius) {
        double farenheit = celsius * 9/5 + 32;

        return farenheit;
    }

    public static double convertToFarenheit(double celsius) {
        double farenheit = celsius * 9/5 + 32;

        return farenheit;
    }

    public static void main(String[] args) {
//        System.out.println(convertToFarenheit(40.5));
//        System.out.println(convertToFarenheit(40));
//        System.out.println(ReverseString.reverseString("Hello"));
        System.out.println(Factorialize.factorialize(5));



    }



}
