package com.surya.dsa.math;

public class LCM {

    public static int getLCMBruteForce(int num1, int num2){

        // Variables
        int lcm = 0;

        // Business logic
        for(int i = 1; lcm == 0; i++){
            int rem1 = i % num1;
            int rem2 = i % num2;

            if (rem1 == 0 && rem2 == 0){
                lcm = i;
            }
        }

        // Return object
        return lcm;
    }

    public static int getGCDBYEuclidean(int num1, int num2){

        // Business logic
        while(num2 != 0){
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }

        // Return object
        return num1;
    }

    public static int getLCMOptimized(int num1, int num2){
        return (num1 * num2) / getGCDBYEuclidean(num1, num2);
    }

}
