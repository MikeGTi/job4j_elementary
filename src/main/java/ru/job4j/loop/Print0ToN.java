package ru.job4j.loop;

import java.util.Locale;
import java.util.StringJoiner;

public class Print0ToN {
    public static void main(String[] args) {
        /*outNTo0(2);
        outNTo0(3);
        System.out.println(sumOnlyEachSecond(1, 2) + " = 1");
        System.out.println(sumOnlyEachSecond(1, 3) + " = 4");
        System.out.println(sumOnlyEachSecond(1, 4) + " = 4");
        System.out.println(sumOnlyEachSecond(1, 5) + " = 9");
        System.out.println(sumOnlyEachSecond(0, 5) + " = 6");

        System.out.println(modWithLoop(4, 2) + " = 0");*/

        //System.out.println(digitSum(123));
        //loopPositiveAndThreeSymb(16, 104);
        //loopX(6);

        //loopToLower(3, 27);
        loopTable();
    }

    public static void loopTable() {
        StringJoiner sj = new StringJoiner(" ");
        int column = 1;
        int row = 1;
        for (int i = 1; i < 90; i++) {
            if (column > 9) {
                column = 1;
                row++;
                System.out.println(sj);
                sj = new StringJoiner(" ");
            }
            sj.add(row * (column++) + "");
        }
    }

    public static void loopHGG(int num1, double num2) {
        StringJoiner sj = new StringJoiner(" ");
        sj.setEmptyValue("0");
        double current = num1;
        int count = 0;
        while (Math.sqrt(current) > 1 + num2) {
            current = Math.sqrt(current);
            count++;
            sj.add(String.format(Locale.ENGLISH, "%.1f", current));
        }
        System.out.println("Промежуточные: " + sj + ", Количество: " + count);
    }

    public static void loopToLower(int n, int m) {
        StringJoiner sj = new StringJoiner(" ");
        sj.setEmptyValue("0");
        if (n > m) {
            n = n + m;
            m = n - m;
            n = n - m;
        }
        int count = 0;
        int i = m;
        while (i - n > n) {
            if (i % 2 == 0) {
                i /= 2;
            } else {
                i--;
            }
            sj.add(i + "");
            count++;
        }
        System.out.println("Числа: " + sj + ", Количество: " + count);
    }

    public static void loopZ(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void loopY(int n, int m) {
        StringJoiner sj = new StringJoiner(" ");
        if (n > m) {
            n = n + m;
            m = n - m;
            n = n - m;
        }
        for (int i = n; i < m + 1; i++) {
            sj.add(String.valueOf(i % 2 == 0 ? 0 : (int) Math.pow(i, 2)));
        }
        System.out.println(sj);
    }

    public static void loopX(int num) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 99; i < 1000; i++) {

          /* Task 53 int i = 1;
                     do {
                         sj.add(String.valueOf((int) Math.pow(2, i++)));
                     } while (i <= n);
             Task 46 for (int i = 1000; i < 1501; i++) {
                        if (left == (i / 100) % 10 && right == (i / 10) % 10) {
             Task 45 int left = (num / 10) % 10;
                     int right = num % 10;
                     for (int i = 100; i < 501; i++) {
                        if (left == (i / 10) % 10 && right == (i % 10))
             Task 44 if (i != reverseNum(i) && !isTwoZerosIn(i) && (Math.sqrt(i * reverseNum(i))) % 1 == 0) {
             Task 43 if ((i % 100) % ((i / 100) % 10) == 0) {
             Task 41 if (((i / 10) % 10) % 3 == (i % 10) % 3) {
             Task 40 if (((i / 10) % 10) % 3 == 0 && (i % 10) % 3 == 0) {
             Task 39 if (i % (((i / 100) % 10) + ((i / 10) % 10) + (i % 10)) == 0) {
             Task 38 if (((i / 100) % 10) % 2 == 0 &&  ((i / 10) % 10) % 2 == 0 && (i % 10) % 2 == 0) {
             Task 3x*/
            if (((i / 100) % 10) * (i % 10) == ((i / 10) % 10) * ((i / 10) % 10)) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj);
        /*StringJoiner sj = new StringJoiner(" ");
        int count = 0;
        int i = 1;
        while (count < 5) {
            if ((num + i) % 2 == 1) {
                sj.add(String.valueOf(num + i));
                count++;
            }
            i++;
        }
        System.out.println(sj);*/
    }

    private static boolean isTwoZerosIn(int num) {
        int count = 0;
        if (num != 0) {
            while (num % 10 == 0) {
                count++;
                num /= 10;
            }
        }
        return count > 1;
    }

    private static int reverseNum(int num) {
        int rsl = 0;
        int num1 = Math.abs(num);
        while (num1 > 0) {
            int mod = num1 % 10;
            rsl = rsl * 10 + mod;
            num1 /= 10;
        }
        return num < 0 ? rsl * -1 : rsl;
    }

    public static void loopProgress(int num) {
        StringJoiner sj = new StringJoiner(" ");
        int count = 0;
        int i = 0;
        while (count < num) {
            count++;
            i += 4;
            sj.add(String.valueOf(7 + i));
        }
        System.out.println(sj);
    }

    public static void loopPositiveAndThreeSymb(int a, int b) {
        System.out.println("Старт");
        StringJoiner sj = new StringJoiner(" ");
        for (int i = b; i > a; i--) {
            if (99 < i && i < 1000) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj);
        System.out.println("Финиш");
    }

    public static void loopPositive(int a, int b) {
        System.out.println("Старт");
        StringJoiner sj = new StringJoiner(" ");
        for (int i = a; i < b; i++) {
            if (9 < i && i < 100) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj);
        System.out.println("Финиш");
    }

    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static int modWithLoop(int n, int d) {
        while (n >= 0) {
            n -= d;
        }
        return n + d;
    }

    public static int countSections(int length, int section) {
        int count = 0;
        int sections = 0;
        while (sections <= length) {
            sections += section;
            count++;
        }
        return count - 1;
    }

    public static int sumOnlyEachSecond(int a, int b) {
        int rsl = 0;
        for (int i = a; i <= b; i += 2) {
            rsl += i;
        }
        return rsl;
    }

    public static void outMToN(int m, int n) {
        for (int i = m; i > n; i--) {
            System.out.println(i);
        }
    }

    public static void outNTo0(int n) {
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void out0ToN(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    public static void outNToM(int n, int m) {
        for (int i = n; i < m; i++) {
            System.out.println(i);
        }
    }
}
