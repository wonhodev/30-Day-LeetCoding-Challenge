package dev.wonho.leetcode.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LastStoneWeightTest {

    private LastStoneWeight lastStoneWeight = new LastStoneWeight();

    @Test
    public void test_Example1() {
        int[] stones = {2, 7, 4, 1, 8, 1};
        assertEquals(1, lastStoneWeight.lastStoneWeight(stones));
    }

    @Test
    public void test_Example2() {
        int[] stones = {1, 3};
        assertEquals(2, lastStoneWeight.lastStoneWeight(stones));
    }

    @Test
    public void test_Example3() {
        int[] stones = {1, 3, 5, 7, 9};
        /*
            1, 3, 5, 7, 9
            1, 2, 3, 5
            1, 2, 2
            1
         */
        assertEquals(1, lastStoneWeight.lastStoneWeight(stones));
    }

    @Test
    public void test_Example4() {
        int[] stones = {4};
        assertEquals(4, lastStoneWeight.lastStoneWeight(stones));
    }

    @Test
    public void test_Example5() {
        int[] stones = { };
        assertEquals(0, lastStoneWeight.lastStoneWeight(stones));
    }

    @Test
    public void test_Example6() {
        int[] stones = {3, 3};
        assertEquals(0, lastStoneWeight.lastStoneWeight(stones));
    }

    @Test
    public void test_Example7() {
        int[] stones = {3, 3, 3};
        assertEquals(3, lastStoneWeight.lastStoneWeight(stones));
    }

}