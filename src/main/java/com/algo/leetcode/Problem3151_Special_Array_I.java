package com.algo.leetcode;

public class Problem3151_Special_Array_I {
    public static boolean isArraySpecial(int[] nums) {
        boolean lastEven = nums[0] % 2 == 0;
        for(int i=1; i<nums.length; i++){
            if(!((nums[i]%2 == 0 && !lastEven) || (nums[i]%2 == 1 && lastEven))){
                return false;
            }
            lastEven = !lastEven;
        }
        return true;
    }
}
