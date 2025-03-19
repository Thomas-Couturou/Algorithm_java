package com.algo.leetcode;

public class Problem3191_Minimum_Operations_to_Make_Binary_Array_Elements_Equal_to_One_I {
    public static int minOperations(int[] nums) {
        int nb_flip = 0;
        int n = nums.length;
        for(int i = 0; i<n-2; i++){
            if(nums[i] == 0){
                nb_flip ++;
                nums[i] = 1;
                nums[i+1] = flip(nums[i+1]);
                nums[i+2] = flip(nums[i+2]);
            }
        }
        if(nums[n-2]==0 || nums[n-1]==0){
            return -1;
        }
        return nb_flip;
    }

    private static int flip(int num){
        if(num == 0){
            return 1;
        }
        return 0;
    }
}
