package dev.wonho.leetcode.week2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BackspaceStringCompareTest {

    private BackspaceStringCompare stringCompare = new BackspaceStringCompare();

    @Test
    @DisplayName("S: ab#c, T: ad#c")
    public void test_Example1() {
        String s = "ab#c";
        String t = "ad#c";
        assertTrue(stringCompare.backspaceCompare(s, t));
    }

    @Test
    @DisplayName("S: ab##, T: c#d#")
    public void test_Example2() {
        String s = "ab##";
        String t = "c#d#";
        assertTrue(stringCompare.backspaceCompare(s, t));
    }

    @Test
    @DisplayName("S: a##c, T: #a#c")
    public void test_Example3() {
        String s = "a##c";
        String t = "#a#c";
        assertTrue(stringCompare.backspaceCompare(s, t));
    }

    @Test
    @DisplayName("S: a#c, T: b")
    public void test_Example4() {
        String s = "a#c";
        String t = "b";
        assertFalse(stringCompare.backspaceCompare(s, t));
    }

}