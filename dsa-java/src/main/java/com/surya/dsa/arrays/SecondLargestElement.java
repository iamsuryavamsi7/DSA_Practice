package com.surya.dsa.arrays;

import java.util.Arrays;

public class SecondLargestElement {

    public static void findSecondLargestElement(int[] targetArr){

        System.out.println("==================== Optimal by sorting ====================");

        findSecondLargestBruteForceBySorting(targetArr);

        System.out.println("\n\n==================== Brute Force Attack ====================");

        findSecondLargestBruteForceOptimal(targetArr);

    }

    // Time Complexity - O(n log n)
    // Space Complexity - O(1)
    public static void findSecondLargestBruteForceBySorting(int[] targetArr){

        // Variables
        int secondLargest = Integer.MIN_VALUE;

        // Business Logic
        Arrays.sort(targetArr);

        int lastIndex = targetArr.length - 1;

        while(true){
            if(lastIndex <= 0){
                secondLargest = targetArr[0];
                break;
            }
            if(targetArr[lastIndex] != targetArr[lastIndex - 1]) {
                secondLargest = targetArr[lastIndex - 1];
                break;
            }
            lastIndex--;
        }

        // Actual answer
        System.out.println(secondLargest);

    }

    // Time Complexity - O(n)
    // Space Complexity - O(1)
    public static void findSecondLargestBruteForceOptimal(int[] targetArr){

        // Variables
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = firstLargest;

        // Business Logic
        for(int num: targetArr){
            if(firstLargest < num){
                secondLargest = firstLargest;
                firstLargest = num;
            }else if (secondLargest < num && num != firstLargest){
                secondLargest = num;
            }
        }

        // Actual answer
        System.out.println(secondLargest);

    }

}
