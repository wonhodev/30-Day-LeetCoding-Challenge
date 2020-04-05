package dev.wonho.leetcode.week1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZeroesTest {

    private final MoveZeroes moveZeroes = new MoveZeroes();

    @Test
    @DisplayName("Input: [0, 1, 0, 3, 12], Output: [1, 3, 12, 0, 0]")
    public void test_Example() {
        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes.moveZeroes(nums);

        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    @DisplayName("Input: [4, 1, 6, 3, 12], Output: [4, 1, 6, 3, 12]")
    public void test_NonZero() {
        int[] nums = {4, 1, 6, 3, 12};

        moveZeroes.moveZeroes(nums);

        assertArrayEquals(new int[]{4, 1, 6, 3, 12}, nums);
    }

    @Test
    @DisplayName("Input: [4, 0, 0, 0, 12], Output: [4, 12, 0, 0, 0]")
    public void test_StartAndEndWithNonZero() {
        int[] nums = {4, 0, 0, 0, 12};

        moveZeroes.moveZeroes(nums);

        assertArrayEquals(new int[]{4, 12, 0, 0, 0}, nums);
    }

    @Test
    @DisplayName("Input: [4, 0, 19, 0, 12], Output: [4, 19, 12, 0, 0]")
    public void test_StartAndMiddleAndEndWithNonZero() {
        int[] nums = {4, 0, 19, 0, 12};

        moveZeroes.moveZeroes(nums);

        assertArrayEquals(new int[]{4, 19, 12, 0, 0}, nums);
    }

    @Test
    @DisplayName("Input: [0, 4, 19, 12, 0], Output: [4, 19, 12, 0, 0]")
    public void test_StartAndEndWithZero() {
        int[] nums = {0, 4, 19, 12, 0};

        moveZeroes.moveZeroes(nums);

        assertArrayEquals(new int[]{4, 19, 12, 0, 0}, nums);
    }

    @Test
    @DisplayName("Input: [0, 4, 0, 19, 0], Output: [4, 19, 0, 0, 0]")
    public void test_StartAndMiddleAndEndWithZero() {
        int[] nums = {0, 4, 0, 19, 0};

        moveZeroes.moveZeroes(nums);

        assertArrayEquals(new int[]{4, 19, 0, 0, 0}, nums);
    }

    @Test
    @DisplayName("Input: [0], Output: [0]")
    public void test_OneZero() {
        int[] nums = {0};

        moveZeroes.moveZeroes(nums);

        assertArrayEquals(new int[]{0}, nums);
    }

    @Test
    @DisplayName("Input: [4], Output: [4]")
    public void test_OneNonZero() {
        int[] nums = {4};

        moveZeroes.moveZeroes(nums);

        assertArrayEquals(new int[]{4}, nums);
    }

}