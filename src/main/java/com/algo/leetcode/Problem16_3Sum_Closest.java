package com.algo.leetcode;

import java.util.*;

public class Problem16_3Sum_Closest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        int n = nums.length;
        for (int i=0; i<n-2; i++){
            int left = i+1;
            int right = n-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target){
                    return target;
                }
                else if (sum < target){
                    left++;
                }
                else{
                    right--;
                }
                if (Math.abs(sum - target) < Math.abs(result - target)){
                    result = sum;
                }
            }
        }
        return result;
    }
}
