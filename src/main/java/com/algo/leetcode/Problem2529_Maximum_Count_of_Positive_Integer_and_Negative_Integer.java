package com.algo.leetcode;

public class Problem2529_Maximum_Count_of_Positive_Integer_and_Negative_Integer {
    public static int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        for(int num : nums){
            if (num>0){
                pos++;
            }
            if(num<0){
                neg++;
            }
        }
        return Math.max(pos, neg);
    }
}
