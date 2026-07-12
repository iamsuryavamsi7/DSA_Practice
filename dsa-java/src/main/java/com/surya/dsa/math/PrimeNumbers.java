package com.surya.dsa.math;

public class PrimeNumbers {

    public static boolean isPrime(int target) {

        // Edge cases
        if (target == 1) return false; // 1 is not prime

        // Variables
        int divisorsCount = 0; // Store to check its prime or not using value

        // Loop to get divisors
        for(int i = 1; (i * i) <= target; i++){
            if ((target % i) == 0) {
                divisorsCount++;
                if(i != target / i) divisorsCount++;
                if(divisorsCount > 2) return false;
            }
        }

        // Return object
        return true;

    }

}
