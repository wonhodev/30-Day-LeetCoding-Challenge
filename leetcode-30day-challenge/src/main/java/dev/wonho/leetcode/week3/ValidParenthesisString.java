package dev.wonho.leetcode.week3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/*
Day 16 - Valid Parenthesis String

Given a string containing only three types of characters: '(', ')' and '*',
write a function to check whether this string is valid. We define the validity of a string by these rules:

    1. Any left parenthesis '(' must have a corresponding right parenthesis ')'.
    2. Any right parenthesis ')' must have a corresponding left parenthesis '('.
    3. Left parenthesis '(' must go before the corresponding right parenthesis ')'.
    4. '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
    5. An empty string is also valid.

Example 1:
    Input: "()"
    Output: True

Example 2:
    Input: "(*)"
    Output: True

Example 3:
    Input: "(*))"
    Output: True

Note:
    The string size will be in the range [1, 100].
 */
public class ValidParenthesisString {

    public boolean checkValidString(String s) {
        Stack<Integer> leftStack = new Stack<>();
        Deque<Integer> starDeque = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            switch (ch) {
                case '*':
                    starDeque.offer(i);
                    break;
                case '(':
                    leftStack.push(i);
                    break;
                case ')':
                    if (leftStack.isEmpty()) {
                        if (starDeque.isEmpty()) {
                            return false;
                        } else {
                            starDeque.pollLast();
                        }
                    } else {
                        leftStack.pop();
                    }
                    break;
            }
        }

        boolean isPair;
        for (Integer left : leftStack) {
            isPair = false;
            while (!starDeque.isEmpty()) {
                if (starDeque.poll() > left) {
                    isPair = true;
                    break;
                }
            }

            if (!isPair) {
                return false;
            }
        }

        return true;
    }

}
