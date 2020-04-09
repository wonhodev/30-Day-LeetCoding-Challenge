package dev.wonho.leetcode.common;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    public void test_createList() {
        int[] input = {1, 2, 4};
        ListNode list = LinkedList.createList(input);
        assertArrayEquals(input, LinkedList.toArray(list));
    }

    @Test
    public void test_createList_Null() {
        assertNull(LinkedList.createList());
    }

    @Test
    public void test_createList_Empty() {
        int[] input = { };
        assertNull(LinkedList.createList(input));
    }

    @Test
    public void test_toString() {
        int[] input = {1, 2, 4};
        ListNode list = LinkedList.createList(input);
        assertEquals(Arrays.toString(input), LinkedList.toString(list));
    }

    @Test
    public void test_toString_Null() {
        assertNull(LinkedList.toString(null));
    }

    @Test
    public void test_toString_Empty() {
        int[] input = { };
        ListNode list = LinkedList.createList(input);
        assertNull(LinkedList.toString(list));
    }

    @Test
    public void test_toArray() {
        int[] input = {1, 2, 4};
        ListNode list = LinkedList.createList(input);
        assertArrayEquals(input, LinkedList.toArray(list));
    }

    @Test
    public void test_toArray_Null() {
        assertNull(LinkedList.toArray(null));
    }

    @Test
    public void test_toArray_Empty() {
        int[] input = { };
        ListNode list = LinkedList.createList(input);
        assertNull(LinkedList.toArray(list));
    }

}