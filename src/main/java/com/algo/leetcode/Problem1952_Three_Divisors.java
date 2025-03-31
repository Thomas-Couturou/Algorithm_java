package com.algo.leetcode;

public class Problem1952_Three_Divisors {
    public static boolean isThree(int n) {
        if(n ==1){
            return false;
        }
        double sqrt = Math.sqrt(n);
        if(sqrt != (int) sqrt){
            return false;
        }
        return isPrime((int) sqrt);
    }

    private static boolean isPrime(int n){
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i<= sqrt; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}
