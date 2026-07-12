package com.surya.dsa.math;

public class Armstrong {

    public static boolean isArmstrong(int target){

        // Variables
        int actual = target; // Store actual to check the value in end
        int digits = 0; // No of digits to do power calculation

        // Get the digits count to do power calculation
        while(target > 0){
            target = target / 10;
            digits++;
        }

        target = actual; // Assign actual value to target to do power calculation
        int calculated = 0; // Store calculated value to check in end

        while(target > 0){
            int lastDigit = target % 10;
            calculated = calculated + getPower(lastDigit, digits);
            target = target / 10;
        }

        // Return object
        return actual == calculated;
    }

    public static int getPower(int target, int power){
        if(power == 0) return 1;
        int powerValue = target;
        for(int i = 1; i < power; i++){
            powerValue = powerValue * target;
        }
        return powerValue;
    }

}
