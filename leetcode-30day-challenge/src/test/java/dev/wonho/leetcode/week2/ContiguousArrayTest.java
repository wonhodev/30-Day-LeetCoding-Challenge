package dev.wonho.leetcode.week2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContiguousArrayTest {

    private final ContiguousArray contiguousArray = new ContiguousArray();

    @Test
    @DisplayName("[0, 1] returns 2")
    public void test_Example1() {
        int[] nums = {0, 1};
        assertEquals(2, contiguousArray.findMaxLength(nums));
    }

    @Test
    @DisplayName("[0, 1, 0] returns 2")
    public void test_Example2() {
        int[] nums = {0, 1, 0};
        assertEquals(2, contiguousArray.findMaxLength(nums));
    }

    @Test
    @DisplayName("[0, 1, 1, 0, 1, 1, 1, 0] returns 4")
    public void test_Example3() {
        int[] nums = {0, 1, 1, 0, 1, 1, 1, 0};
        assertEquals(4, contiguousArray.findMaxLength(nums));
    }

    @Test
    @DisplayName("[0, 0, 0, 1, 1, 1, 0] returns 6")
    public void test_Example4() {
        int[] nums = {0, 0, 0, 1, 1, 1, 0};
        assertEquals(6, contiguousArray.findMaxLength(nums));
    }

    @Test
    @DisplayName("[0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0] returns 6")
    public void test_Example5() {
        int[] nums = {0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0};
        assertEquals(6, contiguousArray.findMaxLength(nums));
    }

    @Test
    @DisplayName("[0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0] returns 6")
    public void test_Example6() {
        int[] nums = {0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0};
        assertEquals(6, contiguousArray.findMaxLength(nums));
    }

    @Test
    @DisplayName("[...] returns 94")
    public void test_Example7() {
        int[] nums = {
                1, 1, 1, 1, 1, 1, 1, 0, 0, 0,
                0, 1, 1, 0, 1, 0, 0, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 0, 0, 0, 0,
                1, 0, 0, 0, 0, 1, 0, 1, 0, 0,
                0, 1, 1, 0, 0, 0, 0, 1, 0, 0,
                1, 1, 1, 1, 1, 0, 0, 1, 0, 1,
                1, 0, 0, 0, 1, 0, 0, 0, 1, 1,
                1, 0, 1, 1, 0, 1, 0, 0, 1, 1,
                0, 1, 0, 0, 1, 1, 1, 0, 0, 1,
                0, 1, 1, 1, 0, 0, 1, 0, 1, 1
        };
        assertEquals(94, contiguousArray.findMaxLength(nums));
    }

}