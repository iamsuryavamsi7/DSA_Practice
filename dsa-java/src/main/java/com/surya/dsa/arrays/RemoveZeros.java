package com.surya.dsa.arrays;

import java.util.Arrays;

public class RemoveZeros {

    public static void removeZeros(int[] targetArr){

        System.out.println("========== Remove Zeros ==========");

        System.out.println(Arrays.toString(removeZerosOptimized(targetArr)));

    }

    public static int[] removeZerosOptimized(int[] targetArr){

        // Variables
        int slow = 0;

        // Business Logic
        for(int fast = 0; fast < targetArr.length; fast++){
            if(targetArr[fast] != 0){
                targetArr[slow] = targetArr[fast];
                slow++;
            }
        }

        for(int i = slow; i < targetArr.length; i++){
            targetArr[i] = 0;
        }

        // Return object
        return targetArr;

    }

}
