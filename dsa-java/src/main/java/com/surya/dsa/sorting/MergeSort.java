package com.surya.dsa.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MergeSort{

    public static void sort(int[] targetArr, int left, int right){

        // Validations
        if (left >= right) return;

        // Variables
        int mid = (left + right) / 2;

        // Business logic
        sort(targetArr, left, mid);
        sort(targetArr, mid + 1, right);

        merge(targetArr, left, mid, right);

        // Actual answer
        System.out.println("[Merge Sort] : " + Arrays.toString(targetArr));

    }

    public static void merge(int[] targetArr, int left, int mid, int right){

        // Variables
        List<Integer> tempArr = new ArrayList<Integer>();
        int first = left;
        int second = mid + 1;

        // Business logic
        while(first <= mid && second <= right){

            int firstVal = targetArr[first];
            int secondVal = targetArr[second];

            if (firstVal < secondVal){
                tempArr.add(firstVal);
                first++;
            }else{
                tempArr.add(secondVal);
                second++;
            }

        }

        while(first <= mid){
            tempArr.add(targetArr[first]);
            first++;
        }

        while(second <= right){
            tempArr.add(targetArr[second]);
            second++;
        }

        for(int i = left; i <= right; i++){
            targetArr[i] = tempArr.get(i - left);
        }

    }

}