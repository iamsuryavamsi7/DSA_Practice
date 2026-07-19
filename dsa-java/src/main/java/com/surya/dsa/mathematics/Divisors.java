package com.surya.dsa.math;

import java.util.*;

public class Divisors {

    public static List<Integer> getAllDivisors(int target){

        List<Integer> divisors = new ArrayList<Integer>(); // Store the divisors in array list because its dynamic

        // Time Complexity: O(n)
        for(int i = 1; i <= target; i++){
            if((target % i) == 0) divisors.add(i);
        }

        return divisors; // Return object

    }

    public static List<Integer> getAllDivisorsOptimized(int target){

        List<Integer> divisors = new ArrayList<Integer>(); // Store the divisors in array list because its dynamic

        // Time Complexity: O(n)
        for(int i = 1; (i * i) <= target; i++){
            if((target % i) == 0){
                divisors.add(i);
                if(i != (target / i)) divisors.add(target / i);
            }
        }

        return divisors; // Return object

    }

}
