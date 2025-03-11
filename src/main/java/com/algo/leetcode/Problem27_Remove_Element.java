package com.algo.leetcode;

public class Problem27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        int i = 0;
        while (i < nums.length){
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
            i++;
        }
        return k;
    }
}
