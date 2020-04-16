package dev.wonho.leetcode.week3;

/*
Day 15 - Product of Array Except Self

Given an array nums of n integers where n > 1, return an array output such that
output[i] is equal to the product of all the elements of nums except nums[i].

Example:
    Input:  [1,2,3,4]
    Output: [24,12,8,6]

Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.

Note: Please solve it without division and in O(n).

Follow up:
    Could you solve it with constant space complexity?
    (The output array does not count as extra space for the purpose of space complexity analysis.)
 */
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] leftProduct = new int[length];
        int[] rightProduct = new int[length];
        int[] output = new int[length];

        leftProduct[0] = 1;
        for (int i = 1; i < length; i++) {
            leftProduct[i] = nums[i - 1] * leftProduct[i - 1];
        }

        rightProduct[length - 1] = 1;
        for (int i = length - 2; i >= 0; i--) {
            rightProduct[i] = nums[i + 1] * rightProduct[i + 1];
        }

        for (int i = 0; i < length; i++) {
            output[i] = leftProduct[i] * rightProduct[i];
        }

        return output;
    }

}
