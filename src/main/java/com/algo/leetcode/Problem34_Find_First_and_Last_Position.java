package com.algo.leetcode;

public class Problem34_Find_First_and_Last_Position {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while (left <= right){
            int mid = (right + left) / 2;
            if (nums[mid] == target){
                result[0] = mid;
                right = mid - 1;
            }
            else if (nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        left = 0;
        right = n-1;
        while (left <= right){
            int mid = (right + left) / 2;
            if (nums[mid] == target){
                result[1] = mid;
                left = mid + 1;
            }
            else if (nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return result;
    }
}
