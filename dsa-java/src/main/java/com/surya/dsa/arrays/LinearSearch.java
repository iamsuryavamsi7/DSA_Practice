package com.surya.dsa.arrays;

public class LinearSearch {

    public static int linearSearch(int[] targetArr, int target){

        // Business Logic
        for(int i = 0; i < targetArr.length; i++){
            if(targetArr[i] == target) return i;
        }

        // Return object
        return -1;

    }

}
