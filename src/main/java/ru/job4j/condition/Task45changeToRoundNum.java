package ru.job4j.condition;

public class Task45changeToRoundNum {
    public static void changeToRoundNum(int number) {
        String rsl;
        if (number % 2 == 0) {
            rsl = "Увеличено до " + (int) (Math.ceil(number / 10f)) * 10;
        } else {
            rsl = "Уменьшено до " + (int) (Math.floor(number / 10f)) * 10;
        }
        if (number % 10 == 0) {
            rsl = "Без изменений";
        }

        System.out.println(rsl);
    }
}
