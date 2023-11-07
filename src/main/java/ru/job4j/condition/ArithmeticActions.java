package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        String action = "none";
        if (left + right == rsl) {
            action = "added";
        } else if (left - right == rsl) {
            action = "subtracted";
        } else if (left * right == rsl) {
            action = "multiplied";
        } else if (left / right == rsl) {
            action = "divided";
        }
        return action;
    }

    public static void main(String[] args) {
        System.out.println(selectAction(100, 200, 300));
    }
}
