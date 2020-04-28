package dev.wonho.leetcode.week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximalSquareTest {

    private final MaximalSquare maximalSquare = new MaximalSquare();

    @Test
    public void test_Example() {
        char[][] matrix = {
                {'1', '0','1','0','0'},
                {'1', '0','1','1','1'},
                {'1', '1','1','1','1'},
                {'1', '0','0','1','0'}
        };
        assertEquals(4, maximalSquare.maximalSquare(matrix));
    }

}