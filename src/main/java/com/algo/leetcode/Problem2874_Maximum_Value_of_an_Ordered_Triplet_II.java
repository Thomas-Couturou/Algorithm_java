package com.algo.leetcode;

public class Problem2874_Maximum_Value_of_an_Ordered_Triplet_II {
    public static long maximumTripletValue(int[] nums) {
        int n = nums.length;
        int[] max_i = new int[n];
        int[] max_k = new int[n];
        int maxVal = nums[0];
        max_i[0] = maxVal;
        for(int i=1; i<n; i++){
            if(nums[i]>maxVal){
                maxVal = nums[i];
            }
            max_i[i] = maxVal;
        }

        maxVal = nums[n-1];
        max_k[n-1] = maxVal;
        for(int k=n-2; k>=0; k--){
            if(nums[k]>maxVal){
                maxVal = nums[k];
            }
            max_k[k] = maxVal;
        }

        long maxValue = 0;
        for (int j = 1; j<n-1; j++){
            maxValue = Math.max(maxValue, (long)(max_i[j-1]- nums[j]) * (long) max_k[j+1] );
        }
        return maxValue;
    }
}
