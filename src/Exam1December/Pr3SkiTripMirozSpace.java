package Exam1December;

import java.util.Scanner;

public class Pr3SkiTripMirozSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String grade = scanner.nextLine();
        double price = 0;

        switch (room) {
            case "room for one person":
                price = 18;
                break;
            case "apartment":
                price = 25;
                if (days < 10) {
                    price *= 0.70;
                } else if (days <= 15) {
                    price *= 0.65;
                } else {
                    price *= 0.50;
                }
                break;
            case "president apartment":
                price = 35;
                if (days < 10) {
                    price *= 0.90;
                } else if (days <= 15) {
                    price *= 0.85;
                } else {
                    price *= 0.80;
                }
                break;
        }

        price *= (days-1);

        if (grade.equals("positive")) {
            price *= 1.25;
        } else if (grade.equals("negative")) {
            price *= 0.90;
        }

        System.out.printf("%.2f", price);
    }
}