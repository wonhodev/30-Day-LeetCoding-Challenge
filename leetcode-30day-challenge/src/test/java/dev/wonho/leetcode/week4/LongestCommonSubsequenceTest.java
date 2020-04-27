package dev.wonho.leetcode.week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonSubsequenceTest {

    private final LongestCommonSubsequence longestSubsequence = new LongestCommonSubsequence();

    @Test
    public void test_Example1() {
        String text1 = "abcde";
        String text2 = "ace";
        assertEquals(3, longestSubsequence.longestCommonSubsequence(text1, text2));
    }

    @Test
    public void test_Example2() {
        String text1 = "abc";
        String text2 = "abc";
        assertEquals(3, longestSubsequence.longestCommonSubsequence(text1, text2));
    }

    @Test
    public void test_Example3() {
        String text1 = "abc";
        String text2 = "def";
        assertEquals(0, longestSubsequence.longestCommonSubsequence(text1, text2));
    }

    @Test
    public void test_Example4() {
        String text1 = "ezupkr";
        String text2 = "ubmrapg";
        assertEquals(2, longestSubsequence.longestCommonSubsequence(text1, text2));
    }

    @Test
    public void test_Example5() {
        String text1 = "bsbininm";
        String text2 = "jmjkbkjkv";
        assertEquals(1, longestSubsequence.longestCommonSubsequence(text1, text2));
    }

    @Test
    public void test_Example6() {
        String text1 = "bsbininm";
        String text2 = "jmjkbkjkbv";
        assertEquals(2, longestSubsequence.longestCommonSubsequence(text1, text2));
    }

    @Test
    public void test_Example7() {
        String text1 = "oxcpqrsvwf";
        String text2 = "shmtulqrypy";
        assertEquals(2, longestSubsequence.longestCommonSubsequence(text1, text2));
    }

    @Test
    public void test_Example8() {
        String text1 = "mhunuzqrkzsnidwbun";
        String text2 = "szulspmhwpazoxijwbq";
        assertEquals(6, longestSubsequence.longestCommonSubsequence(text1, text2));
    }

}