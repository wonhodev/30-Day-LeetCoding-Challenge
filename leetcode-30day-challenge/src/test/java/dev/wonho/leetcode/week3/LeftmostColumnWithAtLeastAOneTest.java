package dev.wonho.leetcode.week3;

import dev.wonho.leetcode.common.BinaryMatrixImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeftmostColumnWithAtLeastAOneTest {

    private final LeftmostColumnWithAtLeastAOne leftmostColumn = new LeftmostColumnWithAtLeastAOne();

    @Test
    public void test_Example1() {
        int[][] mat = {
                {0, 0},
                {1, 1}
        };
        assertEquals(0, leftmostColumn.leftMostColumnWithOne(new BinaryMatrixImpl(mat)));
    }

    @Test
    public void test_Example2() {
        int[][] mat = {
                {0, 0},
                {0, 1}
        };
        assertEquals(1, leftmostColumn.leftMostColumnWithOne(new BinaryMatrixImpl(mat)));
    }

    @Test
    public void test_Example3() {
        int[][] mat = {
                {0, 0},
                {0, 0}
        };
        assertEquals(-1, leftmostColumn.leftMostColumnWithOne(new BinaryMatrixImpl(mat)));
    }

    @Test
    public void test_Example4() {
        int[][] mat = {
                {0, 0, 0, 1},
                {0, 0, 1, 1},
                {0, 1, 1, 1}
        };
        assertEquals(1, leftmostColumn.leftMostColumnWithOne(new BinaryMatrixImpl(mat)));
    }

}