package com.surya.dsa;

import java.util.List;
import java.util.ArrayList;

public class Recap01 {

    // target = 12345
    public static int countDigits(int target){

        if(target == 0) return 1;

        int count = 0;

        while(target > 0) {
            target /= 10;
            count++;
        }

        return count;

    }

    // target = 12345
    public static int reverseNumber(int target){

        int revVal = 0;

        while(target > 0){
            int lastDigit = target % 10;
            revVal= revVal * 10 + lastDigit;
            target /= 10;
        }

        return revVal;

    }

    public static boolean isPalindrome(int target){

        int revVal = 0;
        int temp = target;

        while(target > 0){
            revVal = revVal * 10 + (target % 10);
            target /= 10;
        }

        return temp == revVal;

    }

    public static boolean isArmStrong(int target){

        if(target == 0) return true;

        int count = 0;
        int temp = target;

        while(target > 0){
            target /= 10;
            count++;
        }

        target = temp;
        int processed = 0;

        while(target > 0){
            int lastDigit = target % 10;
            processed += powerVal(lastDigit, count);
            target /= 10;
        }

        return temp == processed;

    }

    public static int powerVal(int target, int count){

        int power = target;

        for(int i = 1; i < count; i++){
            power *= target;
        }

        return power;

    }

    // Brute Force
    public static List<Integer> printAllDivisors(int target){

        List<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i <= target; i++){
            if ((target % i) == 0) list.add(i);
        }

        return list;

    }

    // O(log n)
    public static List<Integer> printAllDivisorsOOfLogN(int target){

        List<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i * i <= target; i++){
            int quotient = target / i;
            if ((target % i) == 0) {
                list.add(i);
                if(quotient != i) list.add(quotient);
            }
        }

        return list;

    }

    public static boolean isPrime(int target){

        for(int i = 2; i * i <= target; i++){
            if ((target % i) == 0) return false;
        }

        return true;

    }

    public static int gcdByBF(int target1, int target2){

        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        for(int i = 1; (i * i) <= target1; i++){
            int quotient = target1 / i;
            if ((target1 % i) == 0) {
                list1.add(i);
                if(i != quotient) list1.add(quotient);
            }
        }

        for(int i = 1; (i * i) <= target2; i++){
            int quotient = target2 / i;
            if ((target2 % i) == 0) {
                list2.add(i);
                if(i != quotient) list2.add(quotient);
            }
        }

        int gcd = -1;

        for (int iVal : list1) {
            for (int jVal : list2) {
                if (iVal == jVal) {
                    if (gcd < iVal) gcd = iVal;
                }
            }
        }

        return gcd;

    }

    // (b, a % b)
    public static int gcdByEuclidean(int a, int b){

        while(b != 0){
            int temp = a;
            a = b;
            b = temp % a;
        }

        return a;

    }

    public static int getLCMbyEuclidean(int a, int b){

        return (a * b) / gcdByEuclidean(a, b);

    }

    public static List<Integer> primeFactorization(int target){

        List<Integer> list = new ArrayList<Integer>();

        for(int i = 2; i <= target; i++){

            while((target % i) == 0){
                target = target / i;
                list.add(i);
            }

        }

        return list;

    }

}
