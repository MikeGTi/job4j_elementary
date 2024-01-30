package ru.job4j.loop;

public class Task150banking {
    public static void loop(int overdraft, int account, int[] transfers) {
        int amount = account;
        int count = 0;
        for (int i = 0; i < transfers.length; i++) {
            if (transfers[i] == 0 || amount + transfers[i] < overdraft) {
                break;
            }
            amount += transfers[i];
            count++;
        }
        System.out.println("Остаток: " + amount + ", операций: " + count);
    }
}
