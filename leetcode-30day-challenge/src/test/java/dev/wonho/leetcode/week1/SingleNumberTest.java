package dev.wonho.leetcode.week1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleNumberTest {

    private final SingleNumber singleNumber = new SingleNumber();

    @Test
    @DisplayName("[2, 2, 1] returns 1")
    public void test_Example1() {
        int[] nums = {2, 2, 1};
        assertEquals(1, singleNumber.singleNumber(nums));
    }

    @Test
    @DisplayName("[4, 1, 2, 1, 2] returns 4")
    public void test_Example2() {
        int[] nums = {4, 1, 2, 1, 2};
        assertEquals(4, singleNumber.singleNumber(nums));
    }

}