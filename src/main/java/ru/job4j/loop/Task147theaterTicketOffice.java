package ru.job4j.loop;

public class Task147theaterTicketOffice {
    public static void loop(int num, int[] orders) {
        int customers = 0;
        int rejections = 0;
        for (int i = 0; i < orders.length; i++) {
            if (num <= 0) {
                break;
            }
            if (num - orders[i] >= 0) {
                num -= orders[i];
                customers++;
            } else {
                rejections++;
            }
        }
        System.out.println("Покупатели: " + customers + ", отказано: " + rejections);
    }
}
