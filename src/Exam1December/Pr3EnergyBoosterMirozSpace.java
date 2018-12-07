package Exam1December;

import java.util.Scanner;

public class Pr3EnergyBoosterMirozSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double totalPrice = 0;

        if (size.equals("small")) {
            if (fruit.equals("Watermelon")) {
                price = 56;
            } else if (fruit.equals("Mango")) {
                price = 36.66;
            } else if (fruit.equals("Pineapple")) {
                price = 42.10;
            } else if (fruit.equals("Raspberry")) {
                price = 20;
            }
            price *= 2;
        } else if (size.equals("big")) {
            if (fruit.equals("Watermelon")) {
                price = 28.70;
            } else if (fruit.equals("Mango")) {
                price = 19.60;
            } else if (fruit.equals("Pineapple")) {
                price = 24.80;
            } else if (fruit.equals("Raspberry")) {
                price = 15.20;
            }
            price *= 5;
        }
        totalPrice = number * price;
        if (totalPrice >= 400 && totalPrice <= 1000) {
            totalPrice = totalPrice * 0.85;
        } else if (totalPrice > 1000) {
            totalPrice = totalPrice * 0.50;
        }
        System.out.printf("%.2f lv.", totalPrice);
    }
}
