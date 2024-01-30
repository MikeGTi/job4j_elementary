package ru.job4j.loop;

import java.util.StringJoiner;

/*
 * 146. Количество и вес людей в лифте
 */
public class Elevator {
    static final int CAPACITY = 4;
    static final int PAYLOAD = 300;

    public static void main(String[] args) {
        int[] ar = {60, 55, 60, 55, 65};
        isWeightOk(ar);
    }

    public static void isWeightOk(int[] people) {
        int peopleCount = 0;
        int weightTotal = 0;

        StringJoiner sj = new StringJoiner(" ");
        sj.setEmptyValue("Нет");

        for (int i = 0; i < people.length; i++) {
            if (weightTotal + people[i] > PAYLOAD || peopleCount + 1 > CAPACITY) {
                if (weightTotal + people[i] > PAYLOAD && peopleCount + 1 > CAPACITY) {
                    sj.add("Много людей и перегруз");
                } else if (weightTotal + people[i] > PAYLOAD) {
                    sj.add("Перегруз");
                } else {
                    sj.add("Много людей");
                }
                break;
            }
            peopleCount++;
            weightTotal += people[i];
        }
        System.out.println("Людей: " + peopleCount + ", вес: " + weightTotal + ", отказ: " + sj);
    }

}
