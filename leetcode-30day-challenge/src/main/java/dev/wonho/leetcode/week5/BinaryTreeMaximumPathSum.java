package dev.wonho.leetcode.week5;

import dev.wonho.leetcode.common.TreeNode;

/*
Day 29 - Binary Tree Maximum Path Sum

Given a non-empty binary tree, find the maximum path sum.

For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree
along the parent-child connections. The path must contain at least one node and does not need to go through the root.

Example 1:
    Input: [1,2,3]
           1
          / \
         2   3
    Output: 6

Example 2:
    Input: [-10,9,20,null,null,15,7]
           -10
           / \
          9  20
            /  \
           15   7
    Output: 42
 */
public class BinaryTreeMaximumPathSum {

    int max;

    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return root.val;
        }

        max = root.val;
        traversal(root);

        return max;
    }

    private int traversal(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = Math.max(traversal(node.left), 0);
        int right = Math.max(traversal(node.right), 0);

        max = Math.max(max, node.val + left + right);

        return node.val + Math.max(left, right);
    }

}
