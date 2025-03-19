package com.algo.leetcode;

import com.algo.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestProblem1261 {
    @Test
    public void testProblem1261(){
        TreeNode root = new TreeNode(-1);
        root.left = null;
        root.right = new TreeNode(-1);
        Problem1261_Find_Elements_in_a_Contaminated_Binary_Tree problem1261 = new Problem1261_Find_Elements_in_a_Contaminated_Binary_Tree();
        problem1261.FindElements(root);
        assertFalse(problem1261.find(1));
        assertTrue(problem1261.find(2));
    }

    @Test
    public void testProblem1261_2(){
        TreeNode root = new TreeNode(-1);
        root.left = new TreeNode(-1);
        root.right = new TreeNode(-1);
        root.left.left = new TreeNode(-1);
        root.left.right = new TreeNode(-1);
        Problem1261_Find_Elements_in_a_Contaminated_Binary_Tree problem1261 = new Problem1261_Find_Elements_in_a_Contaminated_Binary_Tree();
        problem1261.FindElements(root);
        assertTrue(problem1261.find(1));
        assertTrue(problem1261.find(3));
        assertFalse(problem1261.find(5));
    }

    @Test
    public void testProblem1261_3(){
        TreeNode root = new TreeNode(-1);
        root.left = null;
        root.right = new TreeNode(-1);
        root.right.left = new TreeNode(-1);
        root.right.right = null;
        root.right.left.left = new TreeNode(-1);
        Problem1261_Find_Elements_in_a_Contaminated_Binary_Tree problem1261 = new Problem1261_Find_Elements_in_a_Contaminated_Binary_Tree();
        problem1261.FindElements(root);
        assertTrue(problem1261.find(2));
        assertFalse(problem1261.find(3));
        assertFalse(problem1261.find(4));
        assertTrue(problem1261.find(5));
    }
}
