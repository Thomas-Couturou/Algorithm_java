package com.algo.leetcode;

public class Problem3264_Final_Array_State_After_K_Multiplication {
    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0; i<k; i++){
            int index_min = getMin(nums);
            nums[index_min] *= multiplier;
        }
        return nums;
    }

    private static int getMin(int[] nums){
        int index_min = -1;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]< min){
                min = nums[i];
                index_min = i;
            }
        }
        return index_min;
    }
}
