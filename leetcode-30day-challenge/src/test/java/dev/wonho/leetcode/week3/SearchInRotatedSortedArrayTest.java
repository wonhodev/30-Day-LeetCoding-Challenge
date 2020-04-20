package dev.wonho.leetcode.week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInRotatedSortedArrayTest {

    private final SearchInRotatedSortedArray searchInArray = new SearchInRotatedSortedArray();

    @Test
    public void test_Example1() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        assertEquals(4, searchInArray.search(nums, target));
    }

    @Test
    public void test_Example2() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;

        assertEquals(-1, searchInArray.search(nums, target));
    }

    @Test
    public void test_Example3() {
        int[] nums = {3, 1};
        int target = 1;

        assertEquals(1, searchInArray.search(nums, target));
    }

    @Test
    public void test_Example_AllElements() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        assertEquals(0, searchInArray.search(nums, 4));
        assertEquals(1, searchInArray.search(nums, 5));
        assertEquals(2, searchInArray.search(nums, 6));
        assertEquals(3, searchInArray.search(nums, 7));
        assertEquals(4, searchInArray.search(nums, 0));
        assertEquals(5, searchInArray.search(nums, 1));
        assertEquals(6, searchInArray.search(nums, 2));
        assertEquals(-1, searchInArray.search(nums, 8));
        assertEquals(-1, searchInArray.search(nums, 9));
    }

    @Test
    public void test_SoredArray() {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7};
        int target;

        target = 0;
        assertEquals(target, searchInArray.search(nums, target));
        target = 1;
        assertEquals(target, searchInArray.search(nums, target));
        target = 2;
        assertEquals(target, searchInArray.search(nums, target));
        target = 3;
        assertEquals(target, searchInArray.search(nums, target));
        target = 4;
        assertEquals(target, searchInArray.search(nums, target));
        target = 5;
        assertEquals(target, searchInArray.search(nums, target));
        target = 6;
        assertEquals(target, searchInArray.search(nums, target));
        target = 7;
        assertEquals(target, searchInArray.search(nums, target));
    }

}