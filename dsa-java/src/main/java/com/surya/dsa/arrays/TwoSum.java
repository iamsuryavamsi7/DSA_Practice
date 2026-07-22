package com.surya.dsa.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void getTwoSumSlidingOptimized(int[] targetArr, int k) {

        // Variables
        Map<Integer, Integer> arrMap = new HashMap<Integer, Integer>();

        // Business logic
        for (int i = 0; i < targetArr.length; i++){

            if (arrMap.containsKey(k - targetArr[i])){
                System.out.println("indices: " + Arrays.toString((new int[]{arrMap.get(k - targetArr[i]), i})));
                return;
            }

            arrMap.put(targetArr[i], i);

        }

        System.out.println("Default index: " + Arrays.toString(new int[]{-1, -1}));

    }

}
