package dev.wonho.leetcode.week1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStock2Test {

    private final BestTimeToBuyAndSellStock2 buyAndSellStock2 = new BestTimeToBuyAndSellStock2();

    @Test
    @DisplayName("[7, 1, 5, 3, 6, 4] returns 7")
    public void test_Example1() {
        int[] nums = {7, 1, 5, 3, 6, 4};
        assertEquals(7, buyAndSellStock2.maxProfit(nums));
    }

    @Test
    @DisplayName("[1, 2, 3, 4, 5] returns 4")
    public void test_Example2() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(4, buyAndSellStock2.maxProfit(nums));
    }

    @Test
    @DisplayName("[7, 6, 4, 3, 1] returns 0")
    public void test_Example3() {
        int[] nums = {7, 6, 4, 3, 1};
        assertEquals(0, buyAndSellStock2.maxProfit(nums));
    }

    @Test
    @DisplayName("[2, 4, 1] returns 2")
    public void test_Example4() {
        int[] nums = {2, 4, 1};
        assertEquals(2, buyAndSellStock2.maxProfit(nums));
    }

    @Test
    @DisplayName("[2, 1, 2, 0, 1] returns 2")
    public void test_Example5() {
        int[] nums = {2, 1, 2, 0, 1};
        assertEquals(2, buyAndSellStock2.maxProfit(nums));
    }

}