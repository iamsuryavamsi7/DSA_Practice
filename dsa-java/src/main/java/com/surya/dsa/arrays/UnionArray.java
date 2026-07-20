package com.surya.dsa.arrays;

import java.util.*;

public class UnionArray {

    public static void getUnionArrayBruteForce(int[] unionArr01, int[] unionArr02) {

        // Variables
        Set<Integer> unionSet = new HashSet<Integer>();

        // Business logic
        for(int num: unionArr01){
            unionSet.add(num);
        }

        for(int num: unionArr02){
            unionSet.add(num);
        }

        // Actual answer
        System.out.println("===================== Union Array =====================");
        System.out.println("UnionArr: " + unionSet.toString());

    }

    public static void getUnionArrayOptimize(int[] unionArr01, int[] unionArr02) {

        // Variables
        List<Integer> unionArr = new ArrayList<Integer>();
        int first = 0;
        int second = 0;
        int lastValueAdded = Integer.MIN_VALUE;

        // Business Logic
        while(first < unionArr01.length && second < unionArr02.length){
            int firstVal = unionArr01[first];
            int secondVal = unionArr02[second];

            if (firstVal < secondVal){
                if (firstVal != lastValueAdded) {
                    unionArr.add(firstVal);
                    lastValueAdded = firstVal;
                }
                first++;
            }else if (secondVal < firstVal) {
                if (secondVal != lastValueAdded) {
                    unionArr.add(secondVal);
                    lastValueAdded = secondVal;
                }
                second++;
            }else {

                if (firstVal != lastValueAdded) unionArr.add(firstVal);

                first++;
                second++;
                lastValueAdded = firstVal;

            }

        }

        if (first < unionArr01.length){
            while (first < unionArr01.length){
                int firstVal = unionArr01[first];
                if (firstVal != lastValueAdded) {
                    unionArr.add(firstVal);
                    lastValueAdded = firstVal;
                }
                first++;
            }
        } else if (second < unionArr02.length){
            while (second < unionArr02.length){
                int secondVal = unionArr02[second];
                if (secondVal != lastValueAdded) {
                    unionArr.add(secondVal);
                    lastValueAdded = secondVal;
                }
                second++;
            }
        }

        // Actual answer
        System.out.println("===================== Union Array =====================");
        System.out.println("UnionArr: " + unionArr.toString());

    }

}
