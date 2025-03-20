package com.algo.leetcode;

public class Problem1577_Number_of_Ways_Where_Square_Equal_Product_Two_Numbers {
    public static int numTriplets(int[] nums1, int[] nums2) {
        int result = 0;
        for (int num : nums1) {
            result += find2Prod(nums2, (long) num * num);
        }
        for (int num2 : nums2) {
            result += find2Prod(nums1, (long) num2 * num2);
        }
        return result;
    }

    private static int find2Prod(int[] nums, long target){
        int result = 0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if((long) nums[i] * nums[j] == target){
                    result ++;
                }
            }
        }
        return result;
    }
}
