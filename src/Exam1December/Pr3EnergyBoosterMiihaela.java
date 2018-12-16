package Exam1December;

import java.util.Scanner;

public class Pr3EnergyBoosterMiihaela {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String volumeOnset = scanner.nextLine();
        int set = Integer.parseInt(scanner.nextLine());
        double priceForOneSet = 0;

        switch (volumeOnset) {
            case "small":
                switch (fruit) {
                    case "Watermelon":
                        priceForOneSet = 2 * 56;
                        break;
                    case "Mango":
                        priceForOneSet = 2 * 36.66;
                        break;
                    case "Pineapple":
                        priceForOneSet = 2 * 42.10;
                        break;
                    case "Raspberry":
                        priceForOneSet = 2 * 20;
                        break;

                }
                break;
            case "big":
                switch (fruit) {
                    case "Watermelon":
                        priceForOneSet = 5 * 28.70;
                        break;
                    case "Mango":
                        priceForOneSet = 5 * 19.60;
                        break;
                    case "Pineapple":
                        priceForOneSet = 5 * 24.80;
                        break;
                    case "Raspberry":
                        priceForOneSet = 5 * 15.20;
                        break;

                }
                break;
        }
        double price = set * priceForOneSet;

        if (price >= 400 && price <= 1000) {
            price *= 0.85;
        } else if (price > 1000) {
            price *= 0.50;
        }
        System.out.printf("%.2f lv.", price);

    }
}
