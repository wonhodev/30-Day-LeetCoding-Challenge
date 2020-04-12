package dev.wonho.leetcode.week2;

import dev.wonho.leetcode.common.TreeNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiameterOfBinaryTreeTest {

    private final DiameterOfBinaryTree diameterOfBinaryTree = new DiameterOfBinaryTree();

    @Test
    @DisplayName("[1] returns 0")
    public void test_Example1() {
        TreeNode node1 = new TreeNode(1);

        assertEquals(0, diameterOfBinaryTree.diameterOfBinaryTree(node1));
    }

    @Test
    @DisplayName("[1, 2] returns 1")
    public void test_Example2() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);

        node1.left = node2;

        assertEquals(1,diameterOfBinaryTree.diameterOfBinaryTree(node1));
    }

    @Test
    @DisplayName("[1, 2, 3] returns 2")
    public void test_Example3() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);

        node1.left = node2;
        node1.right = node3;

        assertEquals(2,diameterOfBinaryTree.diameterOfBinaryTree(node1));
    }

    @Test
    @DisplayName("[1, 2, 3, 4] returns 3")
    public void test_Example4() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;

        assertEquals(3,diameterOfBinaryTree.diameterOfBinaryTree(node1));
    }

    @Test
    @DisplayName("[1, 2, 3, 4, 5] returns 3")
    public void test_Example5() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        assertEquals(3,diameterOfBinaryTree.diameterOfBinaryTree(node1));
    }

    @Test
    @DisplayName("[1, 2, 3, 4, 5, 6] returns 4")
    public void test_Example6() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;

        assertEquals(4,diameterOfBinaryTree.diameterOfBinaryTree(node1));
    }

    @Test
    @DisplayName("[] returns 0")
    public void test_Example7() {
        assertEquals(0,diameterOfBinaryTree.diameterOfBinaryTree(null));
    }


    @Test
    @DisplayName("[3, 1, null, null, 2] returns 2")
    public void test_Example8() {
        /*
                    3
                   / \
                  1   n
                 / \
                n   2
         */
        TreeNode node3 = new TreeNode(3);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);

        node3.left = node1;
        node1.right = node2;

        assertEquals(2,diameterOfBinaryTree.diameterOfBinaryTree(node3));
    }

    @Test
    @DisplayName("[4, -7, -3, null, null, -9, -3, 9, -7, -4, null, 6, null, -6, -6," +
            " null, null, 0, 6, 5, null, 9, null, null, -1, -4, null, null, null, -2] returns 8")
    public void test_Example9() {
        /*
        4,
        -7, -3,
        null, null, -9, -3,
        9, -7, -4, null,
        6, null, -6, -6, null, null,
        0, 6, 5, null, 9, null,
        null, -1, -4, null, null, null, -2
                             4
                          /      \
                     -7             -3
                     / \         /        \
                    n   n    -9              -3
                           /     \           / \
                        9          -7      -4   n
                       / \        /   \    / \
                     6    n     -6    -6  n   n
                   /  \         /     /
                  0     6      5     9
                 / \   / \    / \   /
                n  -1 -4  n  n   n -2
         */
        // 4
        TreeNode root = new TreeNode(4);
        TreeNode left = new TreeNode(-7);
        TreeNode right = new TreeNode(-3);
        root.left = left;
        root.right = right;

        // -3
        TreeNode root2 = right;
        left = new TreeNode(-9);
        right = new TreeNode(-3);
        root2.left = left;
        root2.right = right;

        // -9
        TreeNode root3 = left;
        left = new TreeNode(9);
        right = new TreeNode(-7);
        root3.left = left;
        root3.right = right;

        // 9
        TreeNode root4 = left;
        left = new TreeNode(6);
        root4.left = left;

        // 6
        TreeNode root5 = left;
        left = new TreeNode(0);
        right = new TreeNode(6);
        root5.left = left;
        root5.right = right;

        // 0
        TreeNode root6 = left;
        right = new TreeNode(-1);
        root6.right = right;

        // 6
        root6 = root5.right;
        left = new TreeNode(-4);
        root6.left = left;

        // -7
        root4 = root3.right;
        left = new TreeNode(-6);
        right = new TreeNode(-6);
        root4.left = left;
        root4.right = right;

        // -6
        root5 = root4.left;
        left = new TreeNode(5);
        root5.left = left;

        // -6
        root5 = root4.right;
        left = new TreeNode(9);
        root5.left = left;

        // 9
        root6 = root5.left;
        left = new TreeNode(-2);
        root6.left = left;

        // -3
        root3 = root2.right;
        left = new TreeNode(-4);
        root3.left = left;

        assertEquals(8,diameterOfBinaryTree.diameterOfBinaryTree(root));
    }

}