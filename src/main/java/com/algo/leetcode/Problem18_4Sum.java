package com.algo.leetcode;

import java.util.*;

public class Problem18_4Sum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new LinkedHashSet<>();
        List<Integer> line = new ArrayList<>();
        int n = nums.length;
        for (int i=0; i<n-3; i++){
            for (int j=i+1; j<n-2; j++){
                int left = j+1;
                int right = n-1;
                while(left < right){
                    long sum = nums[i];
                    if (sum < Integer.MAX_VALUE){
                        sum += nums[j];
                    }
                    if (sum <= Integer.MAX_VALUE){
                        sum += nums[left];
                    }
                    if (sum <= Integer.MAX_VALUE){
                        sum += nums[right];
                    }
                    if (sum == target){
                        line.add(nums[i]);
                        line.add(nums[j]);
                        line.add(nums[left]);
                        line.add(nums[right]);
                        result.add(new ArrayList<>(line));
                        line.clear();
                        left++;
                        right--;
                    }
                    else if (sum < target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
}
