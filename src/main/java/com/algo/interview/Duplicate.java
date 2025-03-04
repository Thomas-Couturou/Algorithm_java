package com.algo.interview;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        boolean result = false;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                result = true;
                break;
            }
            set.add(num);
        }
        return result;
    }

    public static Set<Integer> findDuplicates(int[] nums) {
        Set<Integer> result = new LinkedHashSet<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                result.add(num);
            }
            set.add(num);
        }
        return result;
    }

    public static Set<Integer> removeDuplicates(int[] nums){
        Set<Integer> result = new LinkedHashSet<>();
        for (int num : nums) {
            result.add(num);
        }
        return result;
    }
}
