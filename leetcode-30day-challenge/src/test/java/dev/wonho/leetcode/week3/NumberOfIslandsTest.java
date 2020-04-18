package dev.wonho.leetcode.week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfIslandsTest {

    private final NumberOfIslands numberOfIslands = new NumberOfIslands();

    @Test
    public void test_Example1() {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        assertEquals(1, numberOfIslands.numIslands(grid));
    }

    @Test
    public void test_Example2() {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        assertEquals(3, numberOfIslands.numIslands(grid));
    }

}