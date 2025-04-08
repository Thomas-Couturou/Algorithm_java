package com.algo.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Problem3396_Minimum_Number_of_Operations_to_Make_Elements_in_Array_Distinct {
    public static int minimumOperations(int[] nums) {
        Set<Integer> present = new HashSet<>();
        for(int i = nums.length -1; i>=0; i--){
            if(!present.add(nums[i])){
                return i/3 + 1;
            }
        }
        return 0;
    }
}
