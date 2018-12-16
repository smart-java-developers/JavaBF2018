package Exam1December;

import java.util.Scanner;

public class Pr5TrekkingManiaMiihaela {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numGrops = Integer.parseInt(scanner.nextLine());
        double musala = 0;
        double monblan = 0;
        double kilimanjaro = 0;
        double k2 = 0;
        double everest = 0;

        for (int i = 1; i <= numGrops; i++) {
            int peopleInGrups = Integer.parseInt(scanner.nextLine());

            if (peopleInGrups <= 5) {
                musala += peopleInGrups;
            }
            if (peopleInGrups >= 6 && peopleInGrups <= 12) {
                monblan += peopleInGrups;
            }
            if (peopleInGrups >= 13 && peopleInGrups <= 25) {
                kilimanjaro += peopleInGrups;
            }
            if (peopleInGrups >= 26 && peopleInGrups <= 40) {
                k2 += peopleInGrups;
            }
            if (peopleInGrups >= 41) {
                everest += peopleInGrups;
            }
        }
        double allPeople = musala + monblan + kilimanjaro + k2 + everest;
        double pMusala = musala / allPeople * 100;
        double pMonblan = monblan / allPeople * 100;
        double pKilimanjaro = kilimanjaro / allPeople * 100;
        double pK2 = k2 / allPeople * 100;
        double pEverest = everest / allPeople * 100;

        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n", pMusala, pMonblan, pKilimanjaro, pK2, pEverest);

    }
}
