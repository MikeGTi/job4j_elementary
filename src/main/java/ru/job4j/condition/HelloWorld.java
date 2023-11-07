package ru.job4j.condition;

public class HelloWorld {
    public static String checkNumber(int number) {
        String res = "Operation not support";
        if (number % 3 == 0 && number % 5 == 0) {
            res = "Hello, World!!!";
        } else if (number % 3 == 0) {
            res = "Hello";
        } else if (number % 5 == 0) {
            res = "World";
        }
        return res;
    }
}
