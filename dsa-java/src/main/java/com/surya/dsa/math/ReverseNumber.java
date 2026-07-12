package com.surya.dsa.math;

public class ReverseNumber {

    // This method is for reversing the number
    public static int reverseNumber(int target){
        int reverse = 0;
        while(target > 0){
            int lastDigit = target % 10;
            reverse = reverse * 10 + lastDigit;
            target = target / 10;
        }
        return reverse;
    }

}
