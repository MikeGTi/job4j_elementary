package ru.job4j.loop;

public class Task168stats {
    public static void loop(int num1, int num2, int num3) {
        System.out.println("Цифр: " + getDigitsCount(num1) + ", сумма цифр: " + getDigitsSum(num1) + ", делителей: " + getDividersCount(num1));
        System.out.println("Цифр: " + getDigitsCount(num2) + ", сумма цифр: " + getDigitsSum(num2) + ", делителей: " + getDividersCount(num2));
        System.out.println("Цифр: " + getDigitsCount(num3) + ", сумма цифр: " + getDigitsSum(num3) + ", делителей: " + getDividersCount(num3));
        System.out.println("Сумма всех цифр: " + (getDigitsSum(num1) + getDigitsSum(num2) + getDigitsSum(num3)));
    }

    private static int getDividersSum(int num) {
        int sum = 0;
        for (int i = 1; i < num + 1; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    private static int getDividersCount(int num) {
        int count = 0;
        for (int i = 1; i < num + 1; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }

    private static int getDigitsSum(int num) {
        int res = 0;
        while (num != 0) {
            res += num % 10;
            num /= 10;
        }
        return res;
    }

    private static int getDigitsCount(int num) {
        int res = 0;
        while (num != 0) {
            res++;
            num /= 10;
        }
        return res;
    }
}
