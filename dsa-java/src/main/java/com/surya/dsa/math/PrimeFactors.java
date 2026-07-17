package com.surya.dsa.math;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    // Get prime factorial by using this method
    public static ArrayList<Integer> getPrimeFactors(int target){

        // Validations
        if (target == 1) return new ArrayList<>(List.of(-1));

        // Variable's
        ArrayList<Integer> numsArray = new ArrayList<Integer>();
        int temp = target;

        // Business Logic
        for(int i = 2; i < target; i++) {
            if(temp == 1) break;
            if ((temp % i) == 0 && isPrime(i)) {
                while (true) {
                    if ((temp % i) == 0){
                        numsArray.add(i);
                        temp /= i;
                    }else
                        break;
                }
            }
        }

        int processedVal = 1;

        for(Integer n : numsArray){
            processedVal *= n;
        }

        // Return object
        return processedVal == target ? numsArray : new ArrayList<>(List.of(-1));

    }

    // Get prime factorial by using this method
    public static ArrayList<Integer> getPrimeFactorsOptimized(int target){

        // Validations
        if (target == 1) return new ArrayList<>(List.of(-1));

        // Variable's
        ArrayList<Integer> numsArray = new ArrayList<Integer>();
        int temp = target;

        // Business Logic
        for(int i = 2; (i * i) < temp; i++) {
            if ((temp % i) == 0) {
                while ((temp % i) == 0) {
                    numsArray.add(i);
                    temp /= i;
                }
            }
        }

        if (temp > 1) numsArray.add(temp);

        // Return object
        return numsArray;

    }

    // Util method to check the number is prime or not
    public static boolean isPrime(int target){

        // Validations
        if (target == 1) return false;

        // Variables
        int digitsCount = 0;

        // Business logic
        for(int i = 1; (i * i) <= target; i++){
            if(digitsCount > 2) break;
            if ((target % i) == 0){
                digitsCount++;
                if(i != (target / i)) digitsCount++;
            }
        }

        // Return object
        return digitsCount == 2;

    }

}
