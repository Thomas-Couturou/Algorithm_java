package com.algo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem39_Combination_Sum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        combinationSumRecursive(candidates, target, 0, current, result);
        return result;
    }

    private static void combinationSumRecursive(int[] candidates, int target, int start_index, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start_index; i < candidates.length; i++) {
            current.add(candidates[i]);
            combinationSumRecursive(candidates, target - candidates[i], i, current, result);
            current.remove(current.size() - 1);
        }
    }
}
