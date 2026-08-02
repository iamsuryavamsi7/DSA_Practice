package com.surya.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] targetArr) {

        // Business logic
        for(int i = 0; i < targetArr.length; i++){

            int first = 0;
            int second = 1;
            boolean swapped = false;

            while(second < (targetArr.length - i)){

                int firstNum = targetArr[first];
                int secondNum = targetArr[second];

                if(firstNum > secondNum){
                    swap(targetArr, first, second);
                    swapped = true;
                }

                first++;
                second++;

            }

            if(!swapped) break;

        }

        // Actual answer
        System.out.println("[Bubble Sort] sorted array: " + Arrays.toString(targetArr));

    }

    public static void swap(int[] targetArr, int first, int second){

        int temp = targetArr[first];
        targetArr[first] = targetArr[second];
        targetArr[second] = temp;

    }

}
