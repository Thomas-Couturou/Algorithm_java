package com.algo.leetcode;

public class Problem26_Remove_Duplicates_From_Sorted_Array {
    public static int removeDuplicates(int[] nums) {
        int k = 0;
        int i = 0;
        while (i < nums.length-1){
            if (nums[i] != nums[i+1]){
                nums[k] = nums[i];
                k++;
            }
            i++;
        }
        if (nums.length > 0){
            nums[k] = nums[nums.length-1];
            k++;
        }
        return k;
    }
}
