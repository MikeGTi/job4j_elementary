package ru.job4j.loop;

public class Task160friendsNum {
    public static void main(String[] args) {
        loop(220);
    }

    public static void loop(int a) {
        int aSum = getDividersSum(a);
        int bSum = 0;
        int rsl = 0;
        for (int b = a + 1; b < a * 2; b += 1) {
            bSum = getDividersSum(b);
            if (aSum == b && bSum == a) {
                rsl = b;
                break;
            }
        }
        System.out.println(rsl);
    }

    private static int getDividersSum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
