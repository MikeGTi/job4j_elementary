package ru.job4j.loop;

public class Task169printSandClock {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int columnCount = in.nextInt();
        int columnCount = 9;
        String star = "*";
        String space = " ";
        int add = 1;
        int spaces = 0;
        while (true) {
            System.out.println(space.repeat(spaces)
                    + star.repeat(Math.abs(columnCount - spaces * 2)));
            if (columnCount - spaces * 2 == 1) {
                add = -1;
            }
            spaces += add;
            if (spaces == -1) {
                break;
            }
        }
    }
}
