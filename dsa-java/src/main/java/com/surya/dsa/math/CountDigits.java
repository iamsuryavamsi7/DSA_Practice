package com.surya.dsa.math;

public class CountDigits{

    // This method is to count digits
    public static int countDigits(int target){
        if(target == 0) return 1;
        int count = 0;
        while(target > 0){
            target /= 10;
            count++;
        }
        return count;
    }

}