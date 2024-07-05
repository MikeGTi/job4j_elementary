package ru.job4j.string;

public class LogLine {
    public record Line(String level, String threads, String text) { }

    public Line parse(String str) {
        String[] splitted = (str.split(" ", 2));
        String text = splitted[1].split("\\d] ", 2)[1];
        return new Line(splitted[0],
                        splitted[1].substring(0, splitted[1].length() - text.length() - 1),
                        text);
    }
}
