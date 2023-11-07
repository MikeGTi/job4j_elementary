package ru.job4j.condition;

public class BonusCupCoffee {
    public static int countCup(int count, int n) {
        return count + count / n;
    }

    public static void main(String[] args) {
        System.out.println(countCup(7, 6));
        System.out.println(countCup(213, 6));
    }
}
