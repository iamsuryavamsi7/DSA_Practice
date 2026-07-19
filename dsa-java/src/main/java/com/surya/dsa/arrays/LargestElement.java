package com.surya.dsa.arrays;

import java.util.Arrays;

public class LargestElement {

    public static int findLargestElementByBruteForceSorting(int[] targetArr){

        // Business Logic
        Arrays.sort(targetArr); // Sort the array by using Arrays class for now later we will sort by our self

        // Return object
        return targetArr[targetArr.length - 1];

    }

    public static int findLargestElementByBruteForceOptimal(int[] targetArr){

        // Variables
        int largest = Integer.MIN_VALUE;

        // Business Logic
        for(int num: targetArr){
            if(largest < num) largest = num;
        }

        // Return object
        return largest;

    }

}
