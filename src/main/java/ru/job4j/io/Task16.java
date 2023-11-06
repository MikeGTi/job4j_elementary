package ru.job4j.io;

public class Task16 {

    public static void main(String[] args) {
        String source = "+!?";
        char[] chars = source.toCharArray();
        System.out.printf(chars[0] + "" + chars[0] + chars[0]);
        System.out.printf(chars[1] + "" + chars[1] + chars[1] + chars[1]);
        System.out.printf(chars[2] + "" + chars[2]);
    }
}
