package dev.wonho.leetcode.week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubarraySumEqualsKTest {

    private final SubarraySumEqualsK subarraySumEqualsK = new SubarraySumEqualsK();

    @Test
    public void test_Example1() {
        int[] nums = {1, 1, 1};
        int k = 2;

        assertEquals(2, subarraySumEqualsK.subarraySum(nums, k));
    }

}