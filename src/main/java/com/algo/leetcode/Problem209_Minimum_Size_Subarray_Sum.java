package com.algo.leetcode;

public class Problem209_Minimum_Size_Subarray_Sum {
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int result = nums.length + 1;
        while(right<nums.length){
            while(right<nums.length && sum<target){
                sum += nums[right];
                right++;
            }
            while(left<right && sum>=target){
                sum -= nums[left];
                left++;
            }
            result = Math.min(result, right - left + 1);
        }
        if (result == nums.length + 1){
            return 0;
        }
        return result;
    }
}
