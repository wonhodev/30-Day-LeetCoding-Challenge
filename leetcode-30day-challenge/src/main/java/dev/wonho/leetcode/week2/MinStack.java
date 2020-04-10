package dev.wonho.leetcode.week2;

/*
Day 10 - Min Stack

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

    push(x) -- Push element x onto stack.
    pop() -- Removes the element on top of the stack.
    top() -- Get the top element.
    getMin() -- Retrieve the minimum element in the stack.

Example:
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    minStack.getMin();   --> Returns -3.
    minStack.pop();
    minStack.top();      --> Returns 0.
    minStack.getMin();   --> Returns -2.
 */
public class MinStack {

    Node top;

    public MinStack() {
    }

    public void push(int x) {
        Node node = new Node(x);

        if (top != null) {
            node.min = Math.min(top.min, x);
            top.next = node;
            node.prev = top;
        }

        top = node;
    }

    public void pop() {
        if (top == null) {
            return;
        }

        if (top.prev == null) {
            top = null;
            return;
        }

        top = top.prev;
        top.next = null;
    }

    public int top() {
        return top != null ? top.val : 0;
    }

    public int getMin() {
        return top != null ? top.min : 0;
    }

    private class Node {
        private int val;
        private int min;
        private Node prev;
        private Node next;

        public Node(int x) {
            val = x;
            min = x;
        }
    }

}
