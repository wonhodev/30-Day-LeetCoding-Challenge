package dev.wonho.leetcode.week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BitwiseAndOfNumbersRangeTest {

    private final BitwiseAndOfNumbersRange bitwiseAnd = new BitwiseAndOfNumbersRange();

    @Test
    public void test_Example1() {
        int m = 5;
        int n = 7;

        assertEquals(4, bitwiseAnd.rangeBitwiseAnd(m, n));
    }

    @Test
    public void test_Example2() {
        int m = 0;
        int n = 1;

        assertEquals(0, bitwiseAnd.rangeBitwiseAnd(m, n));
    }

    @Test
    public void test_Example3() {
        int m = 1;
        int n = 10;

        assertEquals(0, bitwiseAnd.rangeBitwiseAnd(m, n));
    }

    @Test
    public void test_Example4() {
        int m = 2147483646;
        int n = 2147483647;

        assertEquals(2147483646, bitwiseAnd.rangeBitwiseAnd(m, n));
    }

    @Test
    public void test_Example5() {
        int m = 2143483647;
        int n = 2147483647;

        assertEquals(2143289344, bitwiseAnd.rangeBitwiseAnd(m, n));
    }

    @Test
    public void test_Example6() {
        int m = 1143483647;
        int n = 2147483647;

        assertEquals(1073741824, bitwiseAnd.rangeBitwiseAnd(m, n));
    }

    @Test
    public void test_MAX_VALUE() {
        int m = 1;
        int n = Integer.MAX_VALUE;

        assertEquals(0, bitwiseAnd.rangeBitwiseAnd(m, n));
    }

}