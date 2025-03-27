package com.algo.leetcode;

import com.algo.utils.TreeNode;

import java.util.TreeMap;

public class Problem1302_Deepest_Leaves_Sum {
    public static int deepestLeavesSum(TreeNode root) {
        TreeMap<Integer, Integer> sumByLevel = new TreeMap<>();
        deepestLeavesSum(root, sumByLevel, 0);
        return sumByLevel.get(sumByLevel.lastKey());
    }

    private static int deepestLeavesSum(TreeNode root, TreeMap<Integer, Integer> sumByLevel, int level){
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            sumByLevel.put(level, sumByLevel.getOrDefault(level, 0) + root.val);
        }
        return deepestLeavesSum(root.left, sumByLevel, level + 1) + deepestLeavesSum(root.right, sumByLevel, level + 1);
    }
}
