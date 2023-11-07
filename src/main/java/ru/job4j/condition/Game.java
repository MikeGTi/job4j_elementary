package ru.job4j.condition;

public class Game {

    public static int checkGame(double percent, int prize, int pay) {
        /*Необходимо реализовать метод так, чтобы при условии,
        что сумма выигрыша (произведение вероятности и стоимости выигрыша) превышает цену игры,
        метод вернул разницу между этими величинами (т.е. чистую прибыль),
        или вернул 0 (при условии что чистая прибыль меньше или равна 0).*/
        return (percent * prize > pay) ? (int) (percent * prize - pay) : 0;
    }

    public static void menu(String name) {
        if ("super mario".equals(name)) {
            System.out.println("Start - super mario");
        }
        if ("tanks".equals(name)) {
            System.out.println("Start - tanks");
        }
        if ("tetris".equals(name)) {
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("super mario");
        Game.menu("tanks");
        Game.menu("tetris");
    }
}
