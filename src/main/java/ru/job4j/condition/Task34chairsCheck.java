package ru.job4j.condition;

public class Task34chairsCheck {
    public static void chairsCheck(int pupils, int chairs) {
        int rst = chairs - pupils;
        switch ((rst < 0) ? -1 : (rst == 0) ? 0 : 1) {
            case -1 -> System.out.println("Не хватает стульев: " + Math.abs(rst));
            case 0 -> System.out.println("Соответствует");
            default -> System.out.println("Лишних стульев: " + rst);
        }
    }

    public static void main(String[] args) {
        chairsCheck(5, 10);
        chairsCheck(10, 5);
        chairsCheck(10, 10);
    }
}