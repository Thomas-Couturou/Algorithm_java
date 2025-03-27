package com.algo.leetcode;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Problem2780_Minimum_Index_of_a_Valid_Split {
    public static int minimumIndex(List<Integer> nums) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        int dominant = -1;
        for (int num : frequency.keySet()) {
            if (dominant == -1 || frequency.get(num) > frequency.get(dominant)) {
                dominant = num;
            }
        }
        int i = 0;
        int n = nums.size();
        int nb_dom = 0;
        while (i< n-1){
            if(nums.get(i) == dominant){
                nb_dom++;
            }
            if(2*nb_dom > i+1 && 2*(frequency.get(dominant) - nb_dom) > n-(i+1)){
                return i;
            }
            i++;
        }
        return -1;
    }
}
