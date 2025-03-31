package com.algo.leetcode;

import com.algo.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem669 {
    @Test
    public void testProblem669(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(2);
        TreeNode result = Problem669_Trim_a_Binary_Search_Tree.trimBST(root, 1, 2);
        assertEquals(result.val, 1);
        assertEquals(result.right.val, 2);
    }

    @Test
    public void testProblem669_2(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(0);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(1);
        TreeNode result = Problem669_Trim_a_Binary_Search_Tree.trimBST(root, 1, 3);
        assertEquals(result.val, 3);
        assertEquals(result.left.val, 2);
        assertEquals(result.left.left.val, 1);
    }
}
