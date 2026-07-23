package com.surya.dsa.arrays;

import java.util.Arrays;

public class SortArrayOnesTwosThrees {

    public static void getSortArrayOnesTwosThrees(int[] targetArrSorted) {

        int onesCount = 0;
        int twosCount = 0;
        int threesCounts = 0;

        for(int num: targetArrSorted){
            if(num == 0) onesCount++;
            if(num == 1) twosCount++;
            if(num == 2) threesCounts++;
        }

        for(int i = 0; i < onesCount; i++){
            targetArrSorted[i]=0;
        }

        for(int i = onesCount; i < (onesCount + twosCount); i++){
            targetArrSorted[i]=1;
        }

        for(int i = (onesCount + twosCount); i < (onesCount + twosCount + threesCounts); i++){
            targetArrSorted[i]=2;
        }

        System.out.println("Sorted array: " + Arrays.toString(targetArrSorted));

        System.out.println("============== Optimzed Version ==============");

        getSortArrayOnesTwosThreesOptimized(targetArrSorted);

    }

    // Optimized version with three pointers
    public static void getSortArrayOnesTwosThreesOptimized(int[] targetArr) {

        // Variables
        int n = targetArr.length;
        int low = 0;
        int mid = 0;
        int high =  n - 1;

        // Business Logic
        while(mid <= high){
            if (targetArr[mid] == 0){
                swapNums(targetArr, low, mid);
                low++;
                mid++;
            } else if (targetArr[mid] == 2){
                swapNums(targetArr, mid, high);
                high--;
            } else {
                mid++;
            }
        }

        // Actual answer
        System.out.println("Sorted array: " + Arrays.toString(targetArr));

    }

    // Util for swapping
    public static void swapNums(int[] targetArr, int left, int right){
        int temp = targetArr[left];
        targetArr[left] = targetArr[right];
        targetArr[right] = temp;
    }

}
