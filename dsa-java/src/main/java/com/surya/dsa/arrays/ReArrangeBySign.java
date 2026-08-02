package com.surya.dsa.arrays;

import java.util.Arrays;

public class ReArrangeBySign {

    public static void getReArrangedArr(int[] targetArr) {

        // variables
        int[] resultArr = new int[targetArr.length];
        int pos = 0;
        int neg = 1;

        // Business logic
        for (int current : targetArr) {
            if (current > 0) {
                resultArr[pos] = current;
                pos += 2;
            } else {
                resultArr[neg] = current;
                neg += 2;
            }
        }

        // Actual answer
        System.out.println("Rearranged arr: " + Arrays.toString(resultArr));

    }

}
