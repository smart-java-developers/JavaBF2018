package Exam1December;

import java.util.Scanner;

public class Pr3SkiTripMiihaela {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int deys = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String evaluation = scanner.nextLine();
        double price = 0;

        switch (room) {
            case "room for one person":
                price = (--deys) * 18;
                break;
            case "apartment":
                if (deys < 10) {
                    price = (--deys) * 25;
                    price *= 0.70;
                } else if (deys <= 15) {
                    price = (--deys) * 25;
                    price *= 0.65;
                } else {
                    price = (--deys) * 25;
                    price *= 0.50;
                }
                break;
            case "president apartment":
                if (deys < 10) {
                    price = (--deys) * 35;
                    price *= 0.90;
                } else if (deys <= 15) {
                    price = (--deys) * 35;
                    price *= 0.85;
                } else {
                    price = (--deys) * 35;
                    price *= 0.80;
                }
                break;
        }

        switch (evaluation) {
            case "positive":
                price *= 1.25;
                break;
            case "negative":
                price *= 0.90;
                break;
        }
        System.out.printf("%.2f", price);
    }
}
