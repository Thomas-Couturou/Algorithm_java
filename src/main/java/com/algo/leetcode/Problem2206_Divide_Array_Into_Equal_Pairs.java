package com.algo.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Problem2206_Divide_Array_Into_Equal_Pairs {
    public static boolean divideArray(int[] nums) {
        Set<Integer> pair = new HashSet<>();
        for(int num : nums){
            if(!pair.remove(num)){
                pair.add(num);
            }
        }
        return pair.isEmpty();
    }
}
