package com.surya.dsa.arrays;

public class RemoveDuplicates {

    public static void removeDuplicates(int[] targetArr){

        System.out.println("========= Remove Duplicates =========");

        System.out.println(removeDuplicatesOptimize(targetArr));

    }

    public static int removeDuplicatesOptimize(int[] targetArr){

        // Variables
        int slow = 0;

        // Business Logic
        for(int i = 1; i < targetArr.length; i++){

            if (targetArr[slow] != targetArr[i]){
                slow++;
                targetArr[slow] = targetArr[i];
            }

        }

        // Return object
        return slow + 1;

    }

}
