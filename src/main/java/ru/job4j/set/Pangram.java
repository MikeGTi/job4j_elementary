package ru.job4j.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pangram {
    public static boolean checkString(String s) {
        Set<Character> alphabetEng = new HashSet<>(Set.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
        List.of(s.toLowerCase().chars().mapToObj(c -> (char) c).filter(c -> c != ' ').toArray(Character[]::new)).forEach(alphabetEng::remove);
        return alphabetEng.size() == 0;
    }
}