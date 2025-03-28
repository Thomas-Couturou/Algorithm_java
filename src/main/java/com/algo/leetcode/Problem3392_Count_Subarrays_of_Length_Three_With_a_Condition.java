package com.algo.leetcode;

public class Problem3392_Count_Subarrays_of_Length_Three_With_a_Condition {
    public static int countSubarrays(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length-2; i++){
            if(2*(nums[i] + nums[i+2]) == nums[i+1]){
                result++;
            }
        }
        return result;
    }
}
