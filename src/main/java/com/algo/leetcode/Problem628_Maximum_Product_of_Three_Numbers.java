package com.algo.leetcode;

import java.util.Arrays;

public class Problem628_Maximum_Product_of_Three_Numbers {
    public static int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return Math.max(nums[0]*nums[1]*nums[n-1], nums[n-1]*nums[n-2]*nums[n-3]);
    }
}
