package com.algo.leetcode;

public class Problem2965_Find_Missing_and_Repeated_Values {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] result = new int[2];
        int n = grid.length;
        boolean[] present = new boolean[n*n];
        for(int[] row : grid){
            for(int num : row){
                if(present[num-1]){
                    result[0] = num;
                } else {
                    present[num-1] = true;
                }
            }
        }
        for(int i=0; i<n*n; i++){
            if(!present[i]){
                result[1] = i+1;
                break;
            }
        }
        return result;
    }
}
