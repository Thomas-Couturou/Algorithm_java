package com.algo.leetcode;

public class Problem1769_Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box {
    public static int[] minOperations(String boxes) {
        int n = boxes.length();
        int[]result = new int[n];
        for(int i=0; i<n; i++){
            if (boxes.charAt(i) == '1'){
                for(int j = 0; j<n; j++){
                    result[j] += Math.abs(j-i);
                }
            }
        }
        return result;
    }
}
