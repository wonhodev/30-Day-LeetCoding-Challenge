package dev.wonho.leetcode.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PerformStringShiftsTest {

    private final PerformStringShifts stringShifts = new PerformStringShifts();

    @Test
    public void test_Eaxmple1() {
        String s = "abc";
        int[][] shift = {{0, 1}, {1, 2}};
        assertEquals("cab", stringShifts.stringShift(s, shift));
    }

    @Test
    public void test_Eaxmple2() {
        String s = "abcdefg";
        int[][] shift = {{1, 1}, {1, 1}, {0, 2}, {1, 3}};
        assertEquals("efgabcd", stringShifts.stringShift(s, shift));
    }

}