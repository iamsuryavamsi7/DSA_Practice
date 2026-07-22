package com.surya.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArrayEqualsK {

    public static void getSubArrayEqualsK(int[] targetArr, int target) {

        // Variables
        int left = 0;
        int maxLen = 0;
        int sum = 0;

        // Business logic
        for(int right = 0; right < targetArr.length; right++){

            sum += targetArr[right];

            while(sum > target && left <= right){
                sum -= targetArr[left];
                left++;
            }

            System.out.println("Sum: " + sum);

            if(sum == target){
                int currentLen = (right - left) + 1;
                System.out.println("CurrentLen: " + currentLen);
                if(maxLen < currentLen) maxLen = currentLen;
            }

        }

        // Actual answer
        System.out.println("======================= SubArrrayEqualsK =======================");
        System.out.println("SubArrrayEqualsK: " + maxLen);

        System.out.println("======================= SubArrrayEqualsKOptimized =======================");
        getSubArrayEqualsKOptimized(targetArr, target);

    }

    private static void getSubArrayEqualsKOptimized(int[] targetArr, int target) {

        // Variables
        int maxLen = 0;
        Map<Integer, Integer> arrMap = new HashMap<Integer, Integer>();
        int prefixSum = 0;

        // Business logic
        for(int i = 0; i < targetArr.length; i++){

            prefixSum += targetArr[i];

            if(prefixSum == target){
                if(maxLen < (i + 1)) maxLen = (i + 1);
            }else if(arrMap.containsKey(prefixSum - target)){
                int currentLen = i - arrMap.get(prefixSum - target);
                if(maxLen < currentLen) maxLen = currentLen;
            }

            if (!arrMap.containsKey(prefixSum)) arrMap.put(prefixSum, i);

        }

        // Actual answer
        System.out.println("======================= SubArrrayEqualsK =======================");
        System.out.println("SubArrrayEqualsK: " + maxLen);

    }

}
