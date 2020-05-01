package dev.wonho.leetcode.week5;

import dev.wonho.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckIfStringIsValidSequenceFromRootToLeavesPathInBinaryTreeTest {

    private CheckIfStringIsValidSequenceFromRootToLeavesPathInBinaryTree checkValidSequence
            = new CheckIfStringIsValidSequenceFromRootToLeavesPathInBinaryTree();

    @Test
    public void test_Example1() {
        TreeNode root = new TreeNode(0);

        TreeNode left = new TreeNode(1, new TreeNode(0), new TreeNode(1));
        TreeNode right = new TreeNode(0);
        right.left = new TreeNode(0);

        root.left = left;
        root.right = right;

        left.left = new TreeNode(0);
        left.left.right = new TreeNode(1);

        left.right = new TreeNode(1, new TreeNode(0), new TreeNode(0));

        int[] arr = {0, 1, 0, 1};

        assertTrue(checkValidSequence.isValidSequence(root, arr));
    }

    @Test
    public void test_Example2() {
        TreeNode root = new TreeNode(0);

        TreeNode left = new TreeNode(1, new TreeNode(0), new TreeNode(1));
        TreeNode right = new TreeNode(0);
        right.left = new TreeNode(0);

        root.left = left;
        root.right = right;

        left.left = new TreeNode(0);
        left.left.right = new TreeNode(1);

        left.right = new TreeNode(1, new TreeNode(0), new TreeNode(0));

        int[] arr = {0, 0, 1};

        assertFalse(checkValidSequence.isValidSequence(root, arr));
    }

    @Test
    public void test_Example3() {
        TreeNode root = new TreeNode(0);

        TreeNode left = new TreeNode(1, new TreeNode(0), new TreeNode(1));
        TreeNode right = new TreeNode(0);
        right.left = new TreeNode(0);

        root.left = left;
        root.right = right;

        left.left = new TreeNode(0);
        left.left.right = new TreeNode(1);

        left.right = new TreeNode(1, new TreeNode(0), new TreeNode(0));

        int[] arr = {0, 1, 1};

        assertFalse(checkValidSequence.isValidSequence(root, arr));
    }

}