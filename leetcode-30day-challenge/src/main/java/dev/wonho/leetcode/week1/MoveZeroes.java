package dev.wonho.leetcode.week1;

/*
Day 4 - Move Zeroes

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:
    Input: [0,1,0,3,12]
    Output: [1,3,12,0,0]

Note:
1. You must do this in-place without making a copy of the array.
2. Minimize the total number of operations.
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int nextIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nextIndex] = nums[i];

                if (nextIndex != i) {
                    nums[i] = 0;
                }

                nextIndex++;
            }
        }
    }

}
