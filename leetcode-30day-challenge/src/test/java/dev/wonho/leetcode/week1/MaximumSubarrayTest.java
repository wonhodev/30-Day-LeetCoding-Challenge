package dev.wonho.leetcode.week1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumSubarrayTest {

    private final MaximumSubarray maximumSubarray = new MaximumSubarray();

    @Test
    @DisplayName("[-2, 1, -3, 4, -1, 2, 1, -5, 4] returns 6")
    public void test_Example() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, maximumSubarray.maxSubArray(nums));
    }

    @Test
    @DisplayName("[] or NULL returns 0")
    public void test_NullOrEmpty() {
        int[] nums = {};
        assertEquals(0, maximumSubarray.maxSubArray(nums));

        nums = null;
        assertEquals(0, maximumSubarray.maxSubArray(nums));
    }

    @Test
    @DisplayName("[1, 2, 3, 4, 5] returns 15")
    public void test_AllPositive() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(15, maximumSubarray.maxSubArray(nums));
    }

    @Test
    @DisplayName("[1, 2, -3, 4, 5] returns 9")
    public void test_OneNegative() {
        int[] nums = {1, 2, -3, 4, 5};
        assertEquals(9, maximumSubarray.maxSubArray(nums));
    }

    @Test
    @DisplayName("[-1, -2, -3, -4, -5] returns -1")
    public void test_AllNegative() {
        int[] nums = {-1, -2, -3, -4, -5};
        assertEquals(-1, maximumSubarray.maxSubArray(nums));
    }

    @Test
    @DisplayName("[4] returns 4")
    public void test_OneElement() {
        int[] nums = {4};
        assertEquals(4, maximumSubarray.maxSubArray(nums));

        nums[0] = -4;
        assertEquals(-4, maximumSubarray.maxSubArray(nums));
    }

}