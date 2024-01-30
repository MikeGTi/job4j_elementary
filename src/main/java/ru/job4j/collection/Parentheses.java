package ru.job4j.collection;

import java.util.Stack;

public class Parentheses {

    public static boolean valid(char[] data) {
        if (data.length % 2 != 0 || data[0] == ')' || data[data.length - 1] == '(') {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        stack.push(data[0]);
        for (int i = 1; i < data.length; i++) {
            char c = data[i];
            if (stack.empty() || c == stack.peek()) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        return stack.empty();
    }
}
