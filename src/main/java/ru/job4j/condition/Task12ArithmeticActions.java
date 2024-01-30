package ru.job4j.condition;

public class Task12ArithmeticActions {
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

    public static void numDecrease(int number) {
        if (number > 99 && number > 0) {
            number = number - 1;
        }
        System.out.println(number);
    }

    public static void main(String[] args) {
        //System.out.println(selectAction(100, 200, 300));
        numDecrease(999999);
    }
}
