package com.algo.leetcode;

import com.algo.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem104 {
    @Test
    public void testProblem104() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertEquals(Problem104_Maximum_Depth_of_Binary_Tree.maxDepth(root), 3);
    }

    @Test
    public void testProblem104_2() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        assertEquals(Problem104_Maximum_Depth_of_Binary_Tree.maxDepth(root), 2);
    }
}
