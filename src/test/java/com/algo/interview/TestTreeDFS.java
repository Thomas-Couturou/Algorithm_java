package com.algo.interview;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTreeDFS {
    @Test
    public void testDfsRecursiveEmptyTree(){
        TreeNode root = null;
        List<Integer> result = TreeDFS.dfsRecursive(root);
        assert(result.isEmpty());
    }

    @Test
    public void testDfsRecursiveSingleTreeNode(){
        TreeNode root = new TreeNode(1);
        List<Integer> result = TreeDFS.dfsRecursive(root);
        assertEquals(List.of(1), result);
    }

    @Test
    public void testDfsRecursiveMultipleTreeNodes(){
        TreeNode root = new TreeNode(1);
        TreeNode child1 = new TreeNode(2);
        TreeNode child2 = new TreeNode(5);
        root.addChild(child1);
        root.addChild(child2);

        child1.addChild(new TreeNode(3));
        child1.addChild(new TreeNode(4));
        child2.addChild(new TreeNode(6));
        child2.addChild(new TreeNode(7));
        child2.addChild(new TreeNode(8));

        List<Integer> result = TreeDFS.dfsRecursive(root);
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8), result);
    }

    @Test
    public void testDfsIterativeEmptyTree(){
        TreeNode root = null;
        List<Integer> result = TreeDFS.dfsIterative(root);
        assert(result.isEmpty());
    }

    @Test
    public void testDfsIterativeSingleTreeNode(){
        TreeNode root = new TreeNode(1);
        List<Integer> result = TreeDFS.dfsIterative(root);
        assertEquals(List.of(1), result);
    }

    @Test
    public void testDfsIterativeMultipleTreeNodes(){
        TreeNode root = new TreeNode(1);
        TreeNode child1 = new TreeNode(2);
        TreeNode child2 = new TreeNode(5);
        root.addChild(child1);
        root.addChild(child2);

        child1.addChild(new TreeNode(3));
        child1.addChild(new TreeNode(4));
        child2.addChild(new TreeNode(6));
        child2.addChild(new TreeNode(7));
        child2.addChild(new TreeNode(8));

        List<Integer> result = TreeDFS.dfsIterative(root);
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8), result);
    }
}
