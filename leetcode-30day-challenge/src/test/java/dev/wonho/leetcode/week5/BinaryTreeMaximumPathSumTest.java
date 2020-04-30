package dev.wonho.leetcode.week5;

import dev.wonho.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeMaximumPathSumTest {

    private final BinaryTreeMaximumPathSum maximumPathSum = new BinaryTreeMaximumPathSum();

    @Test
    public void test_Example1() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        assertEquals(6, maximumPathSum.maxPathSum(root));
    }

    @Test
    public void test_Example2() {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        assertEquals(42, maximumPathSum.maxPathSum(root));
    }

    @Test
    public void test_Example3() {
        TreeNode root = new TreeNode(1, new TreeNode(-2), new TreeNode(3));

        assertEquals(4, maximumPathSum.maxPathSum(root));
    }

    @Test
    public void test_Example4() {
        TreeNode tree1 = new TreeNode(1);
        TreeNode tree2 = new TreeNode(2);
        TreeNode tree3 = new TreeNode(3);
        TreeNode tree4 = new TreeNode(4);
        TreeNode tree5 = new TreeNode(5);
        tree1.left = tree2;
        tree2.left = tree3;
        tree3.left = tree4;
        tree4.left = tree5;

        assertEquals(15, maximumPathSum.maxPathSum(tree1));
    }

}