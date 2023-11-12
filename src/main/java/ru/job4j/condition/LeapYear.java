package ru.job4j.condition;

public class LeapYear {
    public static boolean checkYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else {
            return year % 400 == 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("2023 year leap? : " + checkYear(2023));
        System.out.println("2024 year leap? : " + checkYear(2024));
    }
}
