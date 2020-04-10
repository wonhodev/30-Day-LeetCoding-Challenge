package dev.wonho.leetcode.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinStackTest {

    private final MinStack minStack = new MinStack();

    @Test
    public void test_Example1() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        assertEquals(-3, minStack.getMin());

        minStack.pop();

        assertEquals(0, minStack.top());
        assertEquals(-2, minStack.getMin());
    }

    @Test
    public void test_Example2() {
        MinStack minStack = new MinStack();
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);

        assertEquals(2147483647, minStack.top());

        minStack.pop();

        assertEquals(2147483646, minStack.getMin());

        minStack.pop();

        assertEquals(2147483646, minStack.getMin());

        minStack.pop();
        minStack.push(2147483647);

        assertEquals(2147483647, minStack.top());
        assertEquals(2147483647, minStack.getMin());

        minStack.push(-2147483648);

        assertEquals(-2147483648, minStack.top());
        assertEquals(-2147483648, minStack.getMin());

        minStack.pop();

        assertEquals(2147483647, minStack.getMin());

    }

}