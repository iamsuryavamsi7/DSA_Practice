package com.surya.dsa.arrays;

import java.util.Map;
import java.util.HashMap;

public class MajorityElement {

    // BruteForce
    public static void getMajorityElementBetter(int[] majorityElementArr) {

        // Variables
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int majorityElementVal = Integer.MIN_VALUE;
        int majorityElement = -1;

        // Business logic
        for(int num: majorityElementArr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if (entry.getValue() > majorityElementVal) {
                majorityElementVal = entry.getValue();
                majorityElement = entry.getKey();
            }
        }

        int returnObject = majorityElementVal > (majorityElementArr.length / 2) ? majorityElement : -1;

        // Actual answer
        System.out.println("MajorityElement: " + returnObject );

    }

    // Optimized version with Boyar Moore
    public static void getMajorityElementOptimized(int[] targetArr){

        // Variables
        int candidate = 0;
        int count = 0;
        int frequency = 0;

        // Business Logic
        for(int num: targetArr){

            if(count == 0){
                candidate = num;
                count++;
            } else if (candidate != num) {
                count--;
            } else {
                count++;
            }

        }

        for(int num: targetArr){
            if(num == candidate) frequency++;
        }

        int finalResult = (frequency > (targetArr.length / 2)) ? candidate : -1;

        // Actual answer
        System.out.println("MajorityElement: " + finalResult);

    }

}
