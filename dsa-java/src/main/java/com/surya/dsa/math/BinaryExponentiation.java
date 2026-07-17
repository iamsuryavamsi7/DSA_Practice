package com.surya.dsa.math;

public class BinaryExponentiation {

    public static int getPowerBruteForce(int num, int power){

        int powerVal = 1;

        for(int i = 1; i <= power; i++){
            powerVal *= num;
        }

        return powerVal;

    }

}
