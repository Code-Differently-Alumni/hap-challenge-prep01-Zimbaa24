package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem02Test {
    @Test
    public void isPalindromeTest01(){
        String s = "A man, a plan, a canal: Panama";
        Boolean actual = Problem02.isPalindrome(s);
        Assertions.assertTrue(actual);
    }

    @Test
    public void isPalindromeTest02(){
        String s = "race a car";
        Boolean actual = Problem02.isPalindrome(s);
        Assertions.assertFalse(actual);
    }

    @Test
    public void isPalindromeTest03(){
        String s = "racecar";
        Boolean actual = Problem02.isPalindrome(s);
        Assertions.assertTrue(actual);
    }

    @Test
    public void isPalindromeTest04(){
        String s = " ";
        Boolean actual = Problem02.isPalindrome(s);
        Assertions.assertTrue(actual);
    }
}
