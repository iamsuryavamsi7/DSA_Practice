package com.surya.dsa.math;

import java.util.ArrayList;
import java.util.List;

public class Eratosthenes {

    public static List<Integer> getAllPrimesBruteForce(int target){

        // Variables
        List<Integer> allPrimes = new ArrayList<Integer>();

        // Business Logic
        for(int i = 2; i <= target; i++){
            if(isPrime(i)) allPrimes.add(i);
        }

        // Return object
        return allPrimes;

    }

    public static List<Integer> getAllPrimesOptimized(int target){

        // Variables
        List<Integer> allPrimes = new ArrayList<Integer>();
        boolean[] isPrime = new boolean[target + 1];

        for(int i = 2; i <= target; i++){
            isPrime[i] = true;
        }

        // Business Logic
        for(int i = 2; (i * i) <= target; i++){
            if(isPrime[i]){
                for(int j = i * i; j <= target; j += i){
                    isPrime[j] = false;
                }
            }
        }

        for(int i = 2; i <= target; i++){
            if (isPrime[i]) allPrimes.add(i);
        }

        // Return object
        return allPrimes;

    }

    // Util method to check prime number
    public static boolean isPrime(int target){

        // Validations
        if (target == 1) return false;

        // Variables
        int digitsCount = 0;

        // Business Logic
        for(int i = 1; (i * i) <= target; i++){
            if(digitsCount > 2) return false;
            if ((target % i) == 0) {
                digitsCount++;
                if(i != (target / i)) digitsCount++;
            }
        }

        // Return object
        return digitsCount == 2;

    }

}
