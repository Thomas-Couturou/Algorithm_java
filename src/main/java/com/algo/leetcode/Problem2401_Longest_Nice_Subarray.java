package com.algo.leetcode;

public class Problem2401_Longest_Nice_Subarray {
    public static int longestNiceSubarray(int[] nums) {
        int start = 0;
        int max_length = 0;
        for(int i = 1; i<nums.length; i++){
            int test = isNice(nums, start, i);
            if(test != start-1){
                max_length = Math.max(max_length, i-start);
                start = test +1;
            }
        }
        max_length = Math.max(max_length, nums.length - start);
        return max_length;
    }

    private static int isNice(int[] nums, int start, int end){
        for(int i=end-1; i>=start; i--){
            if((nums[i] & nums[end]) != 0){
                return i;
            }
        }
        return start-1;
    }
}
