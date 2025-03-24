package com.algo.leetcode;

public class Problem1903_Largest_Odd_Number_in_String {
    public static String largestOddNumber(String num) {
        for(int i=num.length() -1; i>-1; i--){
            int number = num.charAt(i);
            if (number%2 ==1){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
