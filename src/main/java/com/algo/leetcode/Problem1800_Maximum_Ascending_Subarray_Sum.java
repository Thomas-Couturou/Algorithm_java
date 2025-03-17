package com.algo.leetcode;

public class Problem1800_Maximum_Ascending_Subarray_Sum {
    public static int maxAscendingSum(int[] nums) {
        int i=0;
        int max_sum = 0;
        while(i<nums.length){
            int sum = nums[i];
            i++;
            while(i<nums.length && nums[i-1] < nums[i]){
                sum += nums[i];
                i++;
            }
            if(sum>max_sum){
                max_sum = sum;
            }
        }
        return max_sum;
    }
}
