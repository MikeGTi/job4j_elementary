package ru.job4j.loop;

public class Task148cruiseShipTicketOffice {

    public static void loop(int children, int adults, int[] cNum, int[] aNum) {
        int adultsCount = 0;
        int childrenCount = 0;
        int groupsCount = 0;
        for (int i = 0; i < cNum.length; i++) {
            if (children == 0 || adults == 0) {
                break;
            }
            if (children - cNum[i] >= 0 && adults - aNum[i] >= 0) {
                children -= cNum[i];
                childrenCount += cNum[i];

                adults -= aNum[i];
                adultsCount += aNum[i];

                groupsCount++;
            }
        }

        System.out.println("Группы: " + groupsCount
                + ", Взрослых: " + adultsCount
                + ", детей: " + childrenCount
                + ", осталось билетов взр: " + adults
                + ", осталось билетов дет: " + children);
    }
}
