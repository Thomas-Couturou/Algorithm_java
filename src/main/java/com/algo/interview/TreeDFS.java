package com.algo.interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TreeDFS {
    public static List<Integer> dfsRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        result.add(root.val);
        for (TreeNode child : root.children) {
            result.addAll(dfsRecursive(child));
        }
        return result;
    }

    public static List<Integer> dfsIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<TreeNode> stack = new LinkedList<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode current = stack.remove(0);
            result.add(current.val);
            stack.addAll(0, current.children);
        }
        return result;
    }
}
