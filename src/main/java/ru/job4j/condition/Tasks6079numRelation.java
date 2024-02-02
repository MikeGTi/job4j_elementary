package ru.job4j.condition;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.StringJoiner;

public class Tasks6079numRelation {

    public static void main(String[] args) {
        secondsToMinutes(340);
        sameNumAmount(112);
        divWithoutRemainder(456);
        getCentury(1876);
    }

    public static void getCentury(int num) {
        int rsl = 0;
        rsl = (num - 1) / 100 + 1;
        System.out.println(num < 1500 || 2000 < num ? "Не попадает в диапазон" : rsl);
    }

    public static void divWithoutRemainder(int num) {
        StringJoiner sj = new StringJoiner(" ");
        List<Integer> digits = Arrays.asList((num / 100) % 10, (num / 10) % 10, num % 10);
        for (int i = 0; i < digits.size(); i++) {
            if (digits.get(i) != 0) {
                if (num % digits.get(i) == 0) {
                    sj.add(String.valueOf(digits.get(i)));
                }
            }
        }
        System.out.println(sj.length() == 0 ? "Таких чисел нет" : sj);
    }

    public static void sameNumAmount(int num) {
        String stringNum = String.valueOf(num);
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (char c : stringNum.toCharArray()) {
            frequency.put(c,
                    frequency.getOrDefault(c, 0) + 1);
        }
        int max = 1;
        for (char key : frequency.keySet()) {
            if (frequency.get(key) > max) {
                max = frequency.get(key);
            }
        }
        System.out.println(max == 1 ? "0" : max);
    }

    public static void innerNum(int num2, int num4) {
        int count = 0;
        if (num4 % 100 == num2) {
            count++;
        }
        if (num4 / 10 % 100 == num2) {
            count++;
        }
        if (num4 / 100 % 100 == num2) {
            count++;
        }
        System.out.println(count);
    }

    public static void midDigitLess(int num) {
        long mid = num / 10 % 10;
        String rsl = "Да";
        int i = 0;
        while (num != 0) {
            i++;
            if (num % 10 <= mid && i != 2) {
                rsl = "Нет";
                break;
            }
            num = num / 10;
        }
        System.out.println(rsl);
    }

    public static void midDigitMore(int num) {
        long mid = num / 10 % 10;
        String rsl = "Да";
        int i = 0;
        while (num != 0) {
            i++;
            if (num % 10 > mid && i != 2) {
                rsl = "Нет";
                break;
            }
            num = num / 10;
        }
        System.out.println(rsl);
    }

    public static void hasEqualDigits(int number) {
        long prev = number % 10;
        String rsl = "Да";
        while (number != 0) {
            if (number % 10 != prev) {
                rsl = "Нет";
                break;
            }
            number = number / 10;
        }
        System.out.println(rsl);
    }

    public static void isRising(int number) {
        long prev = number % 10;
        String rsl = "Да";
        while (number != 0) {
            if (number % 10 > prev) {
                rsl = "Нет";
                break;
            }
            prev = number % 10;
            number = number / 10;
        }
        System.out.println(rsl);
    }

    public static void secondsToMinutes(int seconds) {
        if (-1 < seconds && seconds < 3601) {
            System.out.printf("Минут: %d, секунд: %d%n", seconds / 60, seconds % 60);
        } else {
            System.out.println("Расчет не производится");
        }
    }

    public static void numRelation(int a, int b, int c) {
        String rsl = "Равных нет";
        if (a == b && b == c) {
            rsl = "Все равны";
        } else if (a == b) {
            rsl = "Первое и второе равны";
            if (b < c) {
                rsl = rsl + ", третье больше";
            } else {
                rsl = rsl + ", третье меньше";
            }
        } else if (b == c) {
            rsl = "Второе и третье равны";
            if (a > c) {
                rsl = rsl + ", первое больше";
            } else {
                rsl = rsl + ", первое меньше";
            }
        } else if (a == c) {
            rsl = "Первое и третье равны";
            if (b > a) {
                rsl = rsl + ", второе больше";
            } else {
                rsl = rsl + ", второе меньше";
            }
        }
        System.out.println(rsl);
    }
}
