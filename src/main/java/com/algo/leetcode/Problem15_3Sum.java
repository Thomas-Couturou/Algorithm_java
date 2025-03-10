package com.algo.leetcode;

import java.util.*;

public class Problem15_3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        List<Integer> line = new ArrayList<>();
        int n = nums.length;
        for (int i=0; i<n-2; i++){
            int left = i+1;
            int right = n-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0){
                    line.add(nums[i]);
                    line.add(nums[left]);
                    line.add(nums[right]);
                    result.add(new ArrayList<>(line));
                    line.clear();
                    left++;
                    right--;
                }
                else if (sum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
