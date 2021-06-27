package com.company;

public class ReverseString {

    public static String reverseString(String str) {
        char[] chArr = str.toCharArray();

        String revStr = "";

        for (int i = chArr.length - 1; i >= 0; i--) {
            revStr += chArr[i];

        }


        return revStr;
    }

}
