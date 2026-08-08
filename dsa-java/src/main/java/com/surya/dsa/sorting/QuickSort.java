package com.surya.dsa.sorting;

public class QuickSort {

    public static void sort(int[] targetArr, int left, int right) {

        if(left >= right) return;

        // Variables
        int pivotIndex = partition(targetArr, left, right);

        sort(targetArr, left, pivotIndex - 1);
        sort(targetArr, pivotIndex + 1, right);

    }

    public static int partition(int[] targetArr, int left, int right){
        // Variables
        int first = left - 1;
        int pivot = targetArr[right];

        // Business logic
        for(int second = left; second < right; second++){

            int currentVal = targetArr[second];

            if (currentVal < pivot){
                first++;
                swap(targetArr, first, second);
            }

        }

        int pivotIndex = first + 1;

        swap(targetArr, pivotIndex, right);

        return pivotIndex;
    }

    public static void swap(int[] targetArr, int left, int right){

        int temp = targetArr[left];
        targetArr[left] = targetArr[right];
        targetArr[right] = temp;

    }

}
