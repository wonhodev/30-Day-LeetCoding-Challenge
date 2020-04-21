package dev.wonho.leetcode.week3;

import dev.wonho.leetcode.common.TreeNode;

/*
Day 20 - Construct Binary Search Tree from Preorder Traversal

Return the root node of a binary search tree that matches the given preorder traversal.

(Recall that a binary search tree is a binary tree where for every node,
any descendant of node.left has a value < node.val, and any descendant of node.right has a value > node.val.
Also recall that a preorder traversal displays the value of the node first,
then traverses node.left, then traverses node.right.)

Example 1:
    Input: [8,5,1,7,10,12]
    Output: [8,5,10,1,7,null,12]
         8
       /   \
      5     10
     / \      \
    1   7     12

Note:
    1 <= preorder.length <= 100
    The values of preorder are distinct.
 */
public class ConstructBinarySearchTreeFromPreorderTraversal {

    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }

        TreeNode root = null;
        for (int val : preorder) {
            root = bstFromPreorder(root, val);
        }

        return root;
    }

    private TreeNode bstFromPreorder(TreeNode node, int val) {
        if (node == null) {
            return new TreeNode(val);
        }

        if (val < node.val) {
            node.left = bstFromPreorder(node.left, val);
        } else {
            node.right = bstFromPreorder(node.right, val);
        }

        return node;
    }

}
