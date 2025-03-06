package com.algo.leetcode;

public class Problem9_Palindrome_Number {
    public static boolean isPalindrome(int x) {
        String x_str = Integer.toString(x);
        int n = x_str.length();
        boolean isPalindromic = true;
        for (int i =0; i<n/2; i++){
            if (x_str.charAt(i) != x_str.charAt(n-1-i)){
                isPalindromic = false;
                break;
            }
        }
        return isPalindromic;
    }
}
