package com.surya.dsa.arrays;

import java.util.Arrays;

public class SortArrayOnesTwosThrees {

    public static void getSortArrayOnesTwosThrees(int[] targetArrSorted) {

        int onesCount = 0;
        int twosCount = 0;
        int threesCounts = 0;

        for(int num: targetArrSorted){
            if(num == 0) onesCount++;
            if(num == 1) twosCount++;
            if(num == 2) threesCounts++;
        }

        for(int i = 0; i < onesCount; i++){
            targetArrSorted[i]=0;
        }

        for(int i = onesCount; i < (onesCount + twosCount); i++){
            targetArrSorted[i]=1;
        }

        for(int i = (onesCount + twosCount); i < (onesCount + twosCount + threesCounts); i++){
            targetArrSorted[i]=2;
        }

        System.out.println("Sorted array: " + Arrays.toString(targetArrSorted));

    }

}
