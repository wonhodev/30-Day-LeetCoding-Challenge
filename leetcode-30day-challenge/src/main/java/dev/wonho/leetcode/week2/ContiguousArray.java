package dev.wonho.leetcode.week2;

import java.util.HashMap;
import java.util.Map;

/*
Day 13 - Contiguous Array

Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.

Example 1:
    Input: [0,1]
    Output: 2
    Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.

Example 2:
    Input: [0,1,0]
    Output: 2
    Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.

Note: The length of the given binary array will not exceed 50,000.
 */
public class ContiguousArray {

    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                count--;
            }

            if (!map.containsKey(count)) {
                map.put(count, i);
            } else {
                if (max < i - map.get(count)) {
                    max = i - map.get(count);
                }
            }
        }

        return max;
    }

}
