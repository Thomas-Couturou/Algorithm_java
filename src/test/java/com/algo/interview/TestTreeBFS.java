package com.algo.interview;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTreeBFS {

    @Test
    public void testBfsEmptyTree(){
        TreeNode root = null;
        List<Integer> result = TreeBFS.bfs(root);
        assert(result.isEmpty());
    }

    @Test
    public void testBfsSingleTreeNode(){
        TreeNode root = new TreeNode(1);
        List<Integer> result = TreeBFS.bfs(root);
        assertEquals(List.of(1), result);
    }

    @Test
    public void testBfsMultipleTreeNodes(){
        TreeNode root = new TreeNode(1);
        TreeNode child1 = new TreeNode(2);
        TreeNode child2 = new TreeNode(3);
        root.addChild(child1);
        root.addChild(child2);

        child1.addChild(new TreeNode(4));
        child1.addChild(new TreeNode(5));
        child2.addChild(new TreeNode(6));
        child2.addChild(new TreeNode(7));
        child2.addChild(new TreeNode(8));

        List<Integer> result = TreeBFS.bfs(root);
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8), result);
    }
}
