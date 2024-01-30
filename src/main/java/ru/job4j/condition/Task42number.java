package ru.job4j.condition;

public class Task42number {
    public static void isPairSymmetric(int number) {
        int first = number % 10;
        int second = number / 10 % 10;
        int third = number / 100 % 10;
        int four = number / 1000;
        if (first == third && second == four) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void isPalindromeByChar(int number) {
        boolean rsl = true;
        char[] num = String.valueOf(number).toCharArray();
        for (int i = 0; i < num.length / 2; i++) {
            if (num[i] != num[num.length - 1 - i]) {
                rsl = false;
                break;
            }
        }
        System.out.println(rsl ? "Да" : "Нет");
    }

    public static void isPalindromeByInt(int number) {
        int right = 0;
        int count = 0;
        while (number > right) {
            right = right * 10 + number % 10;
            number = number / 10;
            count++;
        }
        System.out.println(count == 1
                || number == right
                || number != 0 && number == right / 10
                ? "Да" : "Нет");
    }

}