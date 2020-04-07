package dev.wonho.leetcode.week1;

import java.util.*;

/*
Day 6 - Group Anagrams

Given an array of strings, group anagrams together.

Example:
    Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
    Output:
    [
      ["ate","eat","tea"],
      ["nat","tan"],
      ["bat"]
    ]

Note:
    All inputs will be in lowercase.
    The order of your output does not matter.
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);

            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> values = new ArrayList<>();
                values.add(str);
                map.put(key, values);
            }
        }

        return new ArrayList<>(map.values());
    }

}
