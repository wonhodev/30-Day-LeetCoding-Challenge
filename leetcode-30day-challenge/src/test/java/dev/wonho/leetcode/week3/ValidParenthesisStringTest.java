package dev.wonho.leetcode.week3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesisStringTest {

    private final ValidParenthesisString validParenthesis = new ValidParenthesisString();

    @Test
    @DisplayName("() return true")
    public void test_Example1() {
        String s = "()";
        assertTrue(validParenthesis.checkValidString(s));
    }

    @Test
    @DisplayName("(*) return true")
    public void test_Example2() {
        String s = "(*)";
        assertTrue(validParenthesis.checkValidString(s));
    }

    @Test
    @DisplayName("(*)) return true")
    public void test_Example3() {
        String s = "(*))";
        assertTrue(validParenthesis.checkValidString(s));
    }

    @Test
    @DisplayName("((*) return true")
    public void test_Example4() {
        String s = "((*)";
        assertTrue(validParenthesis.checkValidString(s));
    }

    @Test
    @DisplayName("(*))((*) return true")
    public void test_Example5() {
        String s = "(*))((*)";
        assertTrue(validParenthesis.checkValidString(s));
    }

    @Test
    @DisplayName("())*((*) return true")
    public void test_Example6() {
        String s = "())*((*)";
        assertFalse(validParenthesis.checkValidString(s));
    }

    @Test
    @DisplayName("*(() return false")
    public void test_Example7() {
        String s = "*(()";
        assertFalse(validParenthesis.checkValidString(s));
    }

    @Test
    @DisplayName("*(()* return true")
    public void test_Example8() {
        String s = "*(()*";
        assertTrue(validParenthesis.checkValidString(s));
    }

    @Test
    @DisplayName("... return true")
    public void test_Example9() {
        String s = "()*()(()(*()(((())()()())*))()*()(*)(((*))(())(())((*()*(()(())()*(((*(**))((())*)(((()()))(())()))";
        assertTrue(validParenthesis.checkValidString(s));
    }

    @Test
    @DisplayName("\"\" return true")
    public void test_Empty() {
        String s = "";
        assertTrue(validParenthesis.checkValidString(s));
    }

}