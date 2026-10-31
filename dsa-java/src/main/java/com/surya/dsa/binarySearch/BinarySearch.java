package com.surya.dsa.binarySearch;

import com.surya.dsa.customExceptions.TargetNotFoundException;

public class BinarySearch {

    public static int search(int[] targetArr, int target) throws TargetNotFoundException{

        int left = 0;
        int right = targetArr.length - 1;

        while(left <= right){

            int mid = (left + right) / 2;
            int midVal = targetArr[mid];

            if ( midVal > target ){
                right = mid - 1;
            } else if ( midVal < target ){
                left = mid + 1;
            } else {
                return mid;
            }

        }

        throw new TargetNotFoundException("[Binary Search] target element not found");

    }

    public static int searchInsertPosition(int[] targetArr, int target){

        int left = 0;
        int right = targetArr.length - 1;

        while(left <= right){

            int mid = (left + right) / 2;
            int midVal = targetArr[mid];

            if(midVal < target) left = mid + 1;
            else if (midVal > target) right = mid - 1;
            else return mid;

        }

        return left;

    }

    public static int boundarySearch(int[] targetArr, int target){

        int left = 0;
        int right = targetArr.length - 1;
        int firstIndex = right + 1;

        while( left <= right ){

            int mid = (left + right) / 2;
            int midVal = targetArr[mid];

            if (midVal >= target){
                firstIndex = mid;

            }else{

            }

        }

        return firstIndex;

    }

}
