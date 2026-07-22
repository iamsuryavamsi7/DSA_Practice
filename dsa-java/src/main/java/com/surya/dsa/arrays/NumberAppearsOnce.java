package com.surya.dsa.arrays;

import java.util.Map;
import java.util.HashMap;

public class NumberAppearsOnce {

    public static void getNumberAppearsOnce(int[] numArrOnce) {

        // Variables
        Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
        int uniqueKey = 0;

        // Business Logic
        for (int j : numArrOnce) {

            numberMap.put(j, numberMap.getOrDefault(j, 0) + 1);

        }

        for(Map.Entry<Integer, Integer> entry: numberMap.entrySet()){
            if (entry.getValue() == 1) {
                uniqueKey = entry.getKey();
                break;
            }
        }

        // Actual answer
        System.out.println("======================== Number Appears Once ========================");
        System.out.println("Appears for once: " + uniqueKey);

        getNumberAppearsOnceOptimized(numArrOnce);

    }

    public static void getNumberAppearsOnceOptimized(int[] targetArr){

        // Variables
        int uniqueVal = 0;

        // Business Logic
        for (int j : targetArr) {
            uniqueVal = uniqueVal ^ j;
        }

        // Actual answer
        System.out.println("======================== Number Appears Once ========================");
        System.out.println("Appears for once: " + uniqueVal);

    }

}
