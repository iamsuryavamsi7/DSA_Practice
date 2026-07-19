package com.surya.dsa.arrays;

public class CheckIfArrayIsSorted {

    public static void checkArraySorted(int[] targetArr){

        System.out.println("======================= Brute Force check =======================");

        checkArraySortedOptimized(targetArr);

    }

    // Time complexity - O(n)
    // Space Complexity - O(1)
    public static void checkArraySortedOptimized(int[] targetArr){

        // Validations
        if(targetArr.length == 0) {
            System.out.println("isSorted: " + true);
            return;
        }

        // Variables
        boolean isSorted = true;

        // Business Logic
        for(int i = 1; i < targetArr.length; i++){

            if(!isSorted) break;

            int currentVal = targetArr[i];
            int previousVal = targetArr[i - 1];

            isSorted = previousVal <= currentVal;

        }

        // Actual answer
        System.out.println("isSorted: " + isSorted);

    }

}
