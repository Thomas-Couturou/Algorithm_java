package com.algo.leetcode;

public class Problem342_Power_of_Four {
    public static boolean isPowerOfFour(int n) {
        double x = Math.log(n)/Math.log(4);
        return x == (int) x;
    }
}
