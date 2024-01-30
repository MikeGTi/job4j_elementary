package ru.job4j.condition;

public class Tasks80charsStrings {

    public static void main(String[] args) {
        System.out.println(isIdentical('a', 'b'));
        isLatin('A');
        System.out.println(checkChessRook("A8", "E8"));
    }

    public static boolean checkChessRook(String left, String right) {
        return (left.charAt(0) == right.charAt(0) || left.charAt(1) == right.charAt(1));
    }

    public static void isEqualsNamesSurnames(String name1, String surname1, String name2, String surname2) {
        String rsl = "Совпадений нет";
        if ((name1 + surname1).equalsIgnoreCase(name2 + surname2)) {
            rsl = "Тезки и однофамильцы";
        } else if (name1.equalsIgnoreCase(name2)) {
            rsl = "Тезки";
        } else if (surname1.equalsIgnoreCase(surname2)) {
            rsl = "Однофамильцы";
        }
        System.out.println(rsl);
    }

    public static boolean isEquals(String first, String second) {
        return first.equalsIgnoreCase(second);
    }

    public static void isLatin(char s) {
        if ((s > 64 && s < 91) || s > 96 && s < 123) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static boolean isIdentical(char s1, char s2) {
        return s1 == s2;
    }

}
