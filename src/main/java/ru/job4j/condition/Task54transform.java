package ru.job4j.condition;

public class Task54transform {
    public static void transform(int number) {
        char sign = (number < 0) ? '-' : '+';
        int num = Math.abs(number);
        int right = num % 10;
        int middle = num / 10 % 10;
        int left = num / 100 % 10;
        int add = (num % 2 == 0) ? 1 : -1;
        System.out.println(Integer.parseInt(sign + String.valueOf(changeNum(left, add))
                + changeNum(middle, add)
                + changeNum(right, add)));
    }

    private static int changeNum(int num, int add) {
        int rsl = num;

        if (rsl % 2 == 0) {
            rsl += add;
        } else {
            rsl -= add;
        }

        if (rsl < 0 || rsl > 9) {
            rsl = num;
        }
        return rsl;
    }

}
