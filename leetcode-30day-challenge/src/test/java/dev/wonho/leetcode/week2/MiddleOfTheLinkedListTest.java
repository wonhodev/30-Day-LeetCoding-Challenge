package dev.wonho.leetcode.week2;

import dev.wonho.leetcode.common.LinkedList;
import dev.wonho.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MiddleOfTheLinkedListTest {

    private final MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();

    @Test
    public void test_Example1() {
        ListNode head = LinkedList.createList(1, 2, 3, 4, 5);

        ListNode result = middleOfTheLinkedList.middleNode(head);
        int[] results = LinkedList.toArray(result);

        assertArrayEquals(new int[]{3, 4, 5}, results);
    }

    @Test
    public void test_Example2() {
        ListNode head = LinkedList.createList(1, 2, 3, 4, 5, 6);

        ListNode result = middleOfTheLinkedList.middleNode(head);
        int[] results = LinkedList.toArray(result);

        assertArrayEquals(new int[]{4, 5, 6}, results);
    }

    @Test
    public void test_OneNode() {
        ListNode head = LinkedList.createList(1);

        ListNode result = middleOfTheLinkedList.middleNode(head);
        int[] results = LinkedList.toArray(result);

        assertArrayEquals(new int[]{1}, results);
    }

    @Test
    public void test_TwoNodes() {
        ListNode head = LinkedList.createList(1, 2);

        ListNode result = middleOfTheLinkedList.middleNode(head);
        int[] results = LinkedList.toArray(result);

        assertArrayEquals(new int[]{2}, results);
    }

}