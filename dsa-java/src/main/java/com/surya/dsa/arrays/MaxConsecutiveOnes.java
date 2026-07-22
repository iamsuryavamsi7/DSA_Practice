package com.surya.dsa.arrays;

public class MaxConsecutiveOnes {

    public static void getMaxConsecutiveOnes(int[] binaryArr) {

        // Variables
        int maxConsecutive = 0;
        int count = 0;

        // Business Logic
        for(int num: binaryArr){
            if (num == 1){
                count++;
                if (maxConsecutive < count) maxConsecutive = count;
            } else {
                count = 0;
            }
        }

        // Actual answer
        System.out.println("================ Max Consecutive Ones ================");
        System.out.println("Max Consecutive Ones: " + maxConsecutive);

    }

}
