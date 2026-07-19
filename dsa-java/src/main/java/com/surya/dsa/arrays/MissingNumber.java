package com.surya.dsa.arrays;

public class MissingNumber {

    public static void missingNumber(int[] targetArr){

        System.out.println("========== Missing Number Optimized ==========");

        findMissingNumberOptimizedPrefixSum(targetArr);

    }

    public static void findMissingNumberOptimizedPrefixSum(int[] targetArr){

        // Variables
        int actual = 0;
        int potential= 0;

        // Business Logic
        for(int i = 1; i <= targetArr.length + 1; i++){
            potential += i;
        }

        for (int j : targetArr) {
            actual += j;
        }

        // Actual object
        System.out.println("Missing Number: " + (potential - actual));

    }

}
