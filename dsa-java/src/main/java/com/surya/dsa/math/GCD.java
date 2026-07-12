package com.surya.dsa.math;

import java.util.List;
import java.util.ArrayList;

public class GCD {

    // Brute force
    public static int getGCD(int num1, int num2) {

        List<Integer> num1Divisors = new ArrayList<Integer>();
        List<Integer> num2Divisors = new ArrayList<Integer>();
        int gcd = 0;

        for(int i = 1; i <= num1; i++){
            if ((num1 % i) == 0) num1Divisors.add(i);
        }

        for(int i = 1; i <= num2; i++){
            if ((num2 % i) == 0) num2Divisors.add(i);
        }

        for (Integer num1Divisor : num1Divisors) {
            for (Integer num2Divisor : num2Divisors) {
                if (num1Divisor.equals(num2Divisor)) {
                    gcd = Math.max(num1Divisor, gcd);
                }
            }
        }

        return gcd;

    }

    public static int getGCDEuclidean(int num1, int num2){

        while(num2 != 0){

            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }

        return num1;

    }

}
