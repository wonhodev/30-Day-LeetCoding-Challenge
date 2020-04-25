package dev.wonho.leetcode.week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JumpGameTest {

    private final JumpGame jumpGame = new JumpGame();

    @Test
    public void test_Example1() {
        int[] nums = {2, 3, 1, 1, 4};
        assertTrue(jumpGame.canJump(nums));
    }

    @Test
    public void test_Example2() {
        int[] nums = {3, 2, 1, 0, 4};
        assertFalse(jumpGame.canJump(nums));
    }

    @Test
    public void test_Example3() {
        int[] nums = {0};
        assertTrue(jumpGame.canJump(nums));
    }

    @Test
    public void test_Example4() {
        int[] nums = {1};
        assertTrue(jumpGame.canJump(nums));
    }

    @Test
    public void test_Example5() {
        int[] nums = {0, 2, 3};
        assertFalse(jumpGame.canJump(nums));
    }

}