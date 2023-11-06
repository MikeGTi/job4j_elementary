package ru.job4j.io;

public class Task22 {
    public static void main(String[] args) {
        nameInsert("Игорь");
    }

    public static void nameInsert(String name) {
        System.out.printf(String.format("Привет, %s!", name));
    }
}
