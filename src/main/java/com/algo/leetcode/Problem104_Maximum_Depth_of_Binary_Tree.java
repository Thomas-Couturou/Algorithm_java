package com.algo.leetcode;

import com.algo.utils.TreeNode;

public class Problem104_Maximum_Depth_of_Binary_Tree {
    public static int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
