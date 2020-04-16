package dev.wonho.leetcode.week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductOfArrayExceptSelfTest {

    private final ProductOfArrayExceptSelf productOfArray = new ProductOfArrayExceptSelf();

    @Test
    public void test_Example() {
        int[] nums = {1, 2, 3, 4};
        assertArrayEquals(new int[]{24, 12, 8, 6}, productOfArray.productExceptSelf(nums));
    }

}