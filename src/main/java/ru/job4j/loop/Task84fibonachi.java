package ru.job4j.loop;

public class Task84fibonachi {

    public static void main(String[] args) {
        System.out.println(isFibonachi(0));
        System.out.println(isFibonachi(3));
        System.out.println(isFibonachi(5));
    }

    private static boolean isFibonachi(int num) {
        boolean rsl = false;
        if (num == 0 || num == 1 || num == 2) {
            rsl = true;
        } else {
            int prev = 1;
            int next = 2;

            while (next < num) {
                next = next + prev;
                prev = next - prev;
                if (next == num) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }

    public static void loop(int a1, int a2, int num) {
        int sum = 0;
        int count = 0;
        int prev = a1;
        int next = a2;

        while (count != num) {
            sum += prev;

            next = next + prev;
            prev = next - prev;

            count++;
        }
        System.out.println(sum);
    }
}
