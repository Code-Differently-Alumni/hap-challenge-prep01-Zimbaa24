package com.codedifferently;

public class Problem01 {
    public static Boolean isPalindrome(int x) {
        /** first change numbers into string
         * use string builder to reverse
         * check old str with new reversed str
         * if the same then return true*/
        String pal = String.valueOf(x);
        StringBuilder str = new StringBuilder(pal);
        StringBuilder newStr = str.reverse();
//        if(pal.equals(newStr.toString())) {
//            return true;
//        }
            return pal.equals(newStr.toString()) ? true : false;
    }
}
