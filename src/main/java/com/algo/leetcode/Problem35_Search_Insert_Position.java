package com.algo.leetcode;

public class Problem35_Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while (left <= right){
            int mid = (right + left) / 2;
            if (nums[mid] == target){
                return mid;
            }
            if (nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return left;
    }
}
