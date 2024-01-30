package ru.job4j.condition;

import java.util.ArrayList;
import java.util.List;

public class Task58isWinning {

    public static void isWinning(int number) {
        List<Integer> digits = new ArrayList<>(number);
        while (number != 0) {
            digits.add(number % 10);
            number = number / 10;
        }
        if (digits.get(0) + digits.get(1) + digits.get(2) == digits.get(3) + digits.get(4) + digits.get(5)
                && (digits.get(0) + digits.get(1) + digits.get(2)) % 2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
