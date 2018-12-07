package Exam1December;

import java.util.Scanner;

public class Pr2MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        double time1 = distance * time;
        double time2 = (Math.floor(distance / 50)) * 30;
        double totalTime = time1 + time2;

        if (totalTime >= record) {
            System.out.printf("No! He was %.2f seconds slower.", (totalTime - record));
        } else {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        }
    }
}