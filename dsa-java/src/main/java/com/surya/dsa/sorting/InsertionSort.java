package com.surya.dsa.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] targetArr) {

        // Business logic
        for(int i = 1; i < targetArr.length; i++){

            int key = targetArr[i];

            int j = i - 1;

            while(j >= 0 && targetArr[j] > key){
                targetArr[j + 1] = targetArr[j];
                j--;
            }

            targetArr[j + 1] = key;

        }

        // Actual answer
        System.out.println("[Insertion Sort]: " + Arrays.toString(targetArr));

    }

}
