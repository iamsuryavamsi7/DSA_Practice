package com.surya.dsa.math;

public class Palindrome {

    // This method is to check is palindrome or not
    public static boolean isPalindrome(int target){
        int actual = target;
        int reverse = 0;

        while(target > 0){
            int lastDigit = target % 10;
            reverse = reverse * 10 + lastDigit;
            target /= 10;
        }

        return actual == reverse;
    }

}
