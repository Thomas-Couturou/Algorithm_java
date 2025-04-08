package com.algo.leetcode;

public class Problem2873_Maximum_Value_of_an_Ordered_Triplet_I {
    public static long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long maxVal = 0;
        for(int i =0; i<n-2; i++){
            for (int j = i+1; j<n-1; j++){
                for(int k = j+1; k<n; k++){
                    maxVal = Math.max(maxVal, (long)(nums[i]- nums[j])* (long)nums[k]);
                }
            }
        }
        return maxVal;
    }
}
