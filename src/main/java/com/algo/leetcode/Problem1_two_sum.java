package com.algo.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Problem1_two_sum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i =0; i<nums.length; i++){
            for (int j = i+1; j<nums.length; j++){
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    public static int[] twoSumWithHashMap(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, ArrayList<Integer>> map_nums = new HashMap<>();
        for (int i =0; i<nums.length; i++){
            if (!map_nums.containsKey(nums[i])){
                map_nums.put(nums[i], new ArrayList<>());
                map_nums.get(nums[i]).add(i);
            }
            else {
                map_nums.get(nums[i]).add(i);
            }
        }
        for (int j : map_nums.keySet()){
            if (map_nums.containsKey(target - j)){
                result[0] = map_nums.get(j).get(0);
                result[1] = map_nums.get(target - j).get(map_nums.get(target - j).size() -1);
                break;
            }
        }
        return result;
    }
}
