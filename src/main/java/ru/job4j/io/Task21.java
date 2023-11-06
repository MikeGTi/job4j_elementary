package ru.job4j.io;

public class Task21 {
    public static void main(String[] args) {
        printFioAndPhone();
    }

    public static void printFioAndPhone() {
        String expected = "************************" + System.lineSeparator()
                + "* Фамилия Имя Отчество *" + System.lineSeparator()
                + "* +7(938) 123-45-67    *" + System.lineSeparator()
                + "************************";
        System.out.printf(expected);
    }
}
