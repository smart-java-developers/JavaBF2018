package Exam1December;

import java.util.Scanner;

public class Pr2MountainRunMiihaela {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSecunds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeForOneMeter = Double.parseDouble(scanner.nextLine());

        double distance = distanceInMeters * timeForOneMeter;
        double timeFor50meters = Math.floor((distanceInMeters / 50)) * 30;
        double allTime = distance + timeFor50meters;

        if (recordInSecunds <= allTime) {
            System.out.printf("No! He was %.2f seconds slower.", Math.abs(allTime - recordInSecunds));
        } else {
            System.out.printf("Yes! The new record is %.2f seconds.", Math.abs(allTime));
        }
    }
}
