package ru.job4j.string;

public class Task1strings {
    public static String maxMatch(String[] strings) {
        String rsl = strings.length == 1 ? strings[0] : "";
        if (strings.length != 0) {
            out:
            for (int i = 0; i < strings[0].length(); i++) {
                char c = strings[0].charAt(i);
                for (int j = 1; j < strings.length; j++) {
                    if (i == strings[j].length() || c != strings[j].charAt(i)) {
                        rsl = strings[0].substring(0, i);
                        break out;
                    }
                }
            }
        }
        return rsl;
    }
}
