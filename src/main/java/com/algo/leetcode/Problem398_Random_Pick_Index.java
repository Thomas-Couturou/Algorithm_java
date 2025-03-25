package com.algo.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem398_Random_Pick_Index {
    private Map<Integer, List<Integer>> map;
    public Problem398_Random_Pick_Index(int[] nums) {
        map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
    }

    public int pick(int target) {
        List<Integer> list = map.get(target);
        return list.get((int)(Math.random() * list.size()));
    }
}
