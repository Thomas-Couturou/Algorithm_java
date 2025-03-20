package com.algo.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Problem2799_Count_Complete_Subarray_in_an_Array {
    public static int countCompleteSubarrays(int[] nums) {
        Set<Integer> presentElements = new HashSet<>();
        for(int num : nums){
            presentElements.add(num);
        }
        int result = 0;
        for(int i=0; i<nums.length; i++){
            Set<Integer> subarrayElements = new HashSet<>();
            for(int j=i; j<nums.length; j++){
                subarrayElements.add(nums[j]);
                if(subarrayElements.size() == presentElements.size()){
                    result += nums.length - j;
                    break;
                }
            }
        }
        return result;
    }
}
