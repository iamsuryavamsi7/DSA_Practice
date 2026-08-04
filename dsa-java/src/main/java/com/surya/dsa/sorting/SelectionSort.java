package com.surya.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] targetArr){

        // Business logic
        for(int i = 0; i < targetArr.length; i++){
            int minIndex = i;
            int minVal = targetArr[i];
            for(int j = i + 1; j < targetArr.length; j++){
                int currentVal = targetArr[j];
                if(minVal > currentVal){
                    minVal = currentVal;
                    minIndex = j;
                }
            }
            if(i != minIndex)
                swap(targetArr, i, minIndex);
        }

        // Actual answer
        System.out.println("[Selection Sort] : " + Arrays.toString(targetArr));

    }

    public static void swap(int[] targetArr, int first, int second){
        int temp = targetArr[first];
        targetArr[first] = targetArr[second];
        targetArr[second] = temp;
    }

}
