package com.surya.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

    public static void getIntersectionArrayOptimize(int[] unionArr01, int[] unionArr02) {

        // Variables
        List<Integer> intersectionArr = new ArrayList<Integer>();
        int first = 0;
        int second = 0;
        int lastAddedVal = Integer.MIN_VALUE;

        // Business Logic
        while(first < unionArr01.length && second < unionArr02.length){

            int firstVal = unionArr01[first];
            int secondVal = unionArr02[second];

            if(firstVal < secondVal) first++;
            else if(secondVal < firstVal) second++;
            else {
                if(firstVal != lastAddedVal) {
                    intersectionArr.add(firstVal);
                    lastAddedVal = firstVal;
                }
                first++;
                second++;
            }

        }

        // Actual answer
        System.out.println("===================== Intersection Array =====================");
        System.out.println("UnionArr: " + intersectionArr.toString());

    }

}
