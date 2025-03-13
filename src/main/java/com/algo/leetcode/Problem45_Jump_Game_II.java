package com.algo.leetcode;

public class Problem45_Jump_Game_II {
    public static int jump(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 0;
        for(int i=0; i<n; i++){
            int j = 1;
            while(i+j<n && j<=nums[i]){
                if (result[i+j] == 0){
                    result[i+j] = result[i] + 1;
                }
                else{
                    result[i+j] = Math.min(result[i] + 1, result[i+j]);
                }
                j++;
            }
        }
        return result[n-1];
    }
}
