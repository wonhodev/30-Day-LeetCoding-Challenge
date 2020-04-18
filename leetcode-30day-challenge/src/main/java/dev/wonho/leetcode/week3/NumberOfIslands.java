package dev.wonho.leetcode.week3;

/*
Day 17 - Number of Islands

Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
You may assume all four edges of the grid are all surrounded by water.

Example 1:
    Input:
        11110
        11010
        11000
        00000

    Output: 1

Example 2:
    Input:
        11000
        11000
        00100
        00011

    Output: 3
 */
public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int x, int y) {
        if (grid[x][y] == '0') {
            return;
        }

        grid[x][y] = '0';

        if (x < grid.length - 1) {
            dfs(grid, x + 1, y);
        }

        if (x > 0) {
            dfs(grid, x - 1, y);
        }

        if (y < grid[0].length - 1) {
            dfs(grid, x, y + 1);
        }

        if (y > 0) {
            dfs(grid, x, y - 1);
        }
    }

}
