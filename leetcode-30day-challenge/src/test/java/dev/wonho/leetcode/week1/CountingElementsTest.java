package dev.wonho.leetcode.week1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountingElementsTest {

    private final CountingElements countingElements = new CountingElements();

    @Test
    public void test_Example1() {
        int[] arr = {1, 2, 3};
        assertEquals(2, countingElements.countElements(arr));
    }

    @Test
    public void test_Example2() {
        int[] arr = {1, 1, 3, 3, 5, 5, 7, 7};
        assertEquals(0, countingElements.countElements(arr));
    }

    @Test
    public void test_Example3() {
        int[] arr = {1, 3, 2, 3, 5, 0};
        assertEquals(3, countingElements.countElements(arr));
    }

    @Test
    public void test_Example4() {
        int[] arr = {1, 1, 2, 2};
        assertEquals(2, countingElements.countElements(arr));
    }

}