package Exam1December;

import java.util.Scanner;

public class Pr5TrekkingManiaMirozSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupNumber = Integer.parseInt(scanner.nextLine());

        double musala = 0;
        double monblan = 0;
        double kilimanjaro = 0;
        double k2 = 0;
        double everest = 0;

        for (int i = 1; i <= groupNumber; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());

            if (peopleInGroup <= 5) {
                musala += peopleInGroup;
            } else if (peopleInGroup <= 12) {
                monblan += peopleInGroup;
            } else if (peopleInGroup <= 25) {
                kilimanjaro += peopleInGroup;
            } else if (peopleInGroup <= 40) {
                k2 += peopleInGroup;
            } else {
                everest += peopleInGroup;
            }
        }
        double allPeople = musala + monblan + kilimanjaro + k2 + everest;
        double percentMusala = musala / allPeople * 100;
        double percentMonblan = monblan / allPeople * 100;
        double percentKilimanjaro = kilimanjaro / allPeople * 100;
        double percentK2 = k2 / allPeople * 100;
        double percentEverest = everest / allPeople * 100;

        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n", percentMusala, percentMonblan,
                percentKilimanjaro, percentK2, percentEverest);
    }
}

