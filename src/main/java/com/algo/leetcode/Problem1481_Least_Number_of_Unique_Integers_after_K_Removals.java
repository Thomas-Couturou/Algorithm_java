package com.algo.leetcode;

import java.util.*;


public class Problem1481_Least_Number_of_Unique_Integers_after_K_Removals {
    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> freqList = new ArrayList<>(map.values());
        Collections.sort(freqList);
        while(k > 0 && !freqList.isEmpty()){
            if(freqList.get(0) <= k){
                k -= freqList.get(0);
                freqList.remove(0);
            }else{
                k = 0;
            }
        }
        return freqList.size();
    }
}
