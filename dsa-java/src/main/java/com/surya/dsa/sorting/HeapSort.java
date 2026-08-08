package com.surya.dsa.sorting;

public class HeapSort {

    public static void sort(int[] targetArr, int heapSize, int index) {

        int largest = index;

        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if(left < heapSize && targetArr[left] > targetArr[largest]){
            largest = left;
        }

        if(right < heapSize && targetArr[right] > targetArr[largest]) {
            largest = right;
        }

        if(index != largest){
            swap(targetArr, index, largest);
            sort(targetArr, heapSize, largest);
        }

    }

    public static void swap(int[] targetArr, int left, int right){

        int temp = targetArr[left];
        targetArr[left] = targetArr[right];
        targetArr[right] = temp;

    }

}
