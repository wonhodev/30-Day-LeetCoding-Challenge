package dev.wonho.leetcode.week1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HappyNumberTest {

    private final HappyNumber happyNumber = new HappyNumber();

    @Test
    @DisplayName("Input: 19, Output: true")
    public void test_Example() {
        int input = 19;
        assertTrue(happyNumber.isHappy(input));
    }

    @Test
    @DisplayName("Input: 1, Output: true")
    public void test_1() {
        int input = 1;
        assertTrue(happyNumber.isHappy(input));
    }

    @Test
    @DisplayName("Input: 2, Output: false")
    public void test_2() {
        int input = 2;
        assertFalse(happyNumber.isHappy(input));
    }

    @Test
    @DisplayName("Input: 3, Output: false")
    public void test_3() {
        int input = 3;
        assertFalse(happyNumber.isHappy(input));
    }

    @Test
    @DisplayName("Input: 4, Output: false")
    public void test_4() {
        int input = 4;
        assertFalse(happyNumber.isHappy(input));
    }

    @Test
    @DisplayName("Input: 5, Output: false")
    public void test_5() {
        int input = 5;
        assertFalse(happyNumber.isHappy(input));
    }

    @Test
    @DisplayName("Input: 6, Output: false")
    public void test_6() {
        int input = 6;
        assertFalse(happyNumber.isHappy(input));
    }

    @Test
    @DisplayName("Input: 7, Output: true")
    public void test_7() {
        int input = 7;
        assertTrue(happyNumber.isHappy(input));
    }

    @Test
    @DisplayName("Input: 8, Output: false")
    public void test_8() {
        int input = 8;
        assertFalse(happyNumber.isHappy(input));
    }

    @Test
    @DisplayName("Input: 9, Output: false")
    public void test_9() {
        int input = 9;
        assertFalse(happyNumber.isHappy(input));
    }

}