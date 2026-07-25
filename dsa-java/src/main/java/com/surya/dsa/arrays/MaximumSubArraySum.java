package com.surya.dsa.arrays;

import java.util.Arrays;

public class MaximumSubArraySum {

    public static void getMaximumSubArraySumBruteForce(int[] targetArr) {

        // Variables
        int maxSum = Integer.MIN_VALUE;
        int left = 0;
        int right = 0;

        // Business Logic
        for(int i = 0; i < targetArr.length; i++){
            int currentPrefixSum = 0;
            for(int current = i; current < targetArr.length; current++){
                currentPrefixSum += targetArr[current];
                if(maxSum < currentPrefixSum) {
                    maxSum = currentPrefixSum;
                    left = i;
                    right = current;
                }
            }
        }

        int[] resultArr = new int[(right - left) + 1];
        int tempLeft = left;

        while(left <= right){
            resultArr[left - tempLeft] = targetArr[left];
            left++;
        }

        // Actual answer
        System.out.println("Max sub array: " + Arrays.toString(resultArr) + " Max Val: " + maxSum);

    }

    public static void getMaximumSubArrayKadaneLawOptimized(int[] targetArr){

        // Variables
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        int left = 0;
        int right = 0;
        int tempStart = 0;

        for(int i = 0; i < targetArr.length; i++){

            currentSum += targetArr[i];

            if(currentSum < 0){
                currentSum = 0;
                tempStart = i + 1;
            }

            if(maxSum < currentSum){
                maxSum = currentSum;
                left = tempStart;
                right = i;
            }

        }

        int[] resultArr = new int[(right - left) + 1];

        for(int i = left; i <= right; i++){
            resultArr[i - left] = targetArr[i];
        }

        // Actual answer
        System.out.println("Max Val: " + maxSum + " result array: " + Arrays.toString(resultArr));

    }

}
