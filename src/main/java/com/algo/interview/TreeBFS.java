package com.algo.interview;

import java.util.List;
import java.util.ArrayList;

public class TreeBFS {
    public static List<Integer> bfs(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.remove(0);
            result.add(current.val);
            for (TreeNode child : current.children) {
                queue.add(child);
            }
        }
        return result;
    }
}
