package com.surya.dsa.arrays;

import java.util.Arrays;

public class BasicArrayOperations {

    public static void basicArrayOperations(){

        System.out.println("\n\n\nBasic Array Operations: \n");

        int[] numsArr = new int[5];

        for(int i = 0; i < numsArr.length; i++){
            numsArr[i] = i * 10;
        }

        System.out.println(Arrays.toString(numsArr));

        for(int i = 0; i < numsArr.length; i++){
            if (i == (numsArr.length - 1)) System.out.print(numsArr[i]);
            else System.out.print(numsArr[i] + " : ");
        }

        System.out.println("\n\n");

        for(int num: numsArr){
            System.out.print(num + " : ");
        }

        System.out.println("\n\n");

        numsArr[3] = 100;

        System.out.println("Array length: " + numsArr.length);

        for(int i = numsArr.length - 1; i >= 0; i--){
            if (i == 0) System.out.print(numsArr[i]);
            else System.out.print(numsArr[i] + " : ");
        }

    }

}
