package com.surya.dsa.sorting;

public class CountingSort {

    public static void sort(int[] targetArr){

        int largest = Integer.MIN_VALUE;

        for(int num: targetArr){
            if (num > largest) largest = num;
        }

        int[] frequencyArr = new int[largest + 1];

        for(int num: targetArr){
            frequencyArr[num]++;
        }

        int currentIndex = 0;

        for(int i = 0; i < frequencyArr.length; i++){

            if(frequencyArr[i] != 0){
                int index = currentIndex;
                for(int j = 0; j < frequencyArr[i]; j++){
                    targetArr[index] = i;
                    index++;
                }
                currentIndex += frequencyArr[i];
            }

        }

    }

}
