package com.algo.leetcode;

public class Problem41_First_Missing_Positive {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i=0;
        while (i<n){
            if (nums[i]<= n && nums[i] >0){
                if(nums[nums[i]-1]<=n && nums[nums[i]-1]> 0 && nums[nums[i]-1] != nums[i]){
                    int temp = nums[nums[i]-1];
                    nums[nums[i]-1] = nums[i];
                    nums[i] = temp;
                }
                else{
                    nums[nums[i]-1] = nums[i];
                    i++;
                }
            }
            else{
                i++;
            }
        }
        for (int j=0; j<n; j++){
            if(j+1 != nums[j]){
                return j+1;
            }
        }
        return n+1;
    }
}
