package dev.wonho.leetcode.week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstUniqueTest {

    @Test
    public void test_Example1() {
        int[] nums = {2, 3, 5};
        FirstUnique firstUnique = new FirstUnique(nums);
        assertEquals(2, firstUnique.showFirstUnique());
        firstUnique.add(5);            // the queue is now [2,3,5,5]
        assertEquals(2, firstUnique.showFirstUnique());
        firstUnique.add(2);            // the queue is now [2,3,5,5,2]
        assertEquals(3, firstUnique.showFirstUnique());
        firstUnique.add(3);            // the queue is now [2,3,5,5,2,3]
        assertEquals(-1, firstUnique.showFirstUnique());
    }

    @Test
    public void test_Example2() {
        int[] nums = {7, 7, 7, 7, 7, 7};
        FirstUnique firstUnique = new FirstUnique(nums);
        assertEquals(-1, firstUnique.showFirstUnique());
        firstUnique.add(7);            // the queue is now [7,7,7,7,7,7,7]
        firstUnique.add(3);            // the queue is now [7,7,7,7,7,7,7,3]
        firstUnique.add(3);            // the queue is now [7,7,7,7,7,7,7,3,3]
        firstUnique.add(7);            // the queue is now [7,7,7,7,7,7,7,3,3,7]
        firstUnique.add(17);           // the queue is now [7,7,7,7,7,7,7,3,3,7,17]
        assertEquals(17, firstUnique.showFirstUnique());
    }

    @Test
    public void test_Example3() {
        int[] nums = {809};
        FirstUnique firstUnique = new FirstUnique(nums);
        assertEquals(809, firstUnique.showFirstUnique());
        firstUnique.add(809);          // the queue is now [809,809]
        assertEquals(-1, firstUnique.showFirstUnique());
    }

    @Test
    public void test_Example4() {
        int[] nums = {5, 3, 2};
        FirstUnique firstUnique = new FirstUnique(nums);
        assertEquals(5, firstUnique.showFirstUnique());
        firstUnique.add(5);            // the queue is now [2,3,5,5]
        assertEquals(3, firstUnique.showFirstUnique());
        firstUnique.add(2);            // the queue is now [2,3,5,5,2]
        assertEquals(3, firstUnique.showFirstUnique());
        firstUnique.add(3);            // the queue is now [2,3,5,5,2,3]
        assertEquals(-1, firstUnique.showFirstUnique());
    }

}