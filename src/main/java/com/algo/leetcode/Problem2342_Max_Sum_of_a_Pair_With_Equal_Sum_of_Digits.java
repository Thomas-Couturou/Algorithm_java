package com.algo.leetcode;

import java.util.*;

public class Problem2342_Max_Sum_of_a_Pair_With_Equal_Sum_of_Digits {
    public static int maximumSum(int[] nums) {
        Map<Integer, List<Integer>> digitSumMap = new HashMap<>();
        for(int num : nums){
            int sum = digitSum(num);
            if(!digitSumMap.containsKey(sum)){
                digitSumMap.put(sum, new ArrayList<>());
            }
            digitSumMap.get(sum).add(num);
        }
        int maxSum = -1;
        for(List<Integer> list : digitSumMap.values()){
            if(list.size() > 1){
                Collections.sort(list);
                maxSum = Math.max(maxSum, list.get(list.size()-1) + list.get(list.size()-2));
            }
        }
        return maxSum;
    }

    private static int digitSum(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
