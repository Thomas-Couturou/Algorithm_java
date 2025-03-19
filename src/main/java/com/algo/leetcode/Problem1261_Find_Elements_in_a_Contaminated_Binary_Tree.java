package com.algo.leetcode;

import com.algo.utils.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class Problem1261_Find_Elements_in_a_Contaminated_Binary_Tree {
    private Set<Integer> nodesValSet;

    public void FindElements(TreeNode root) {
        nodesValSet = new HashSet<>();
        dfs(root, 0);
    }

    private void dfs(TreeNode root, int val) {
        if (root == null) {
            return;
        }
        root.val = val;
        nodesValSet.add(val);
        dfs(root.left, 2 * val + 1);
        dfs(root.right, 2 * val + 2);
    }

    public boolean find(int target) {
        return nodesValSet.contains(target);
    }
}
