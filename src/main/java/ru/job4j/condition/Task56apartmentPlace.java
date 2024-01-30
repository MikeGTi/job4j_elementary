package ru.job4j.condition;

public class Task56apartmentPlace {
    public static void apartmentPlace(int number) {
        int apartByFloor = 3;
        int floor = number / apartByFloor + (number % apartByFloor > 0 ? 1 : 0);
        int placement = (number % apartByFloor == 0 ? 3 : number % apartByFloor);
        System.out.println(floor);
        System.out.println(placement);
    }
}
