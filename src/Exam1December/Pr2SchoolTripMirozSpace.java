package Exam1December;

import java.util.Scanner;

public class Pr2SchoolTripMirozSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int foodKg = Integer.parseInt(scanner.nextLine());
        double foodDog1 = Double.parseDouble(scanner.nextLine());
        double foodDog2 = Double.parseDouble(scanner.nextLine());
        double foodDog3 = Double.parseDouble(scanner.nextLine());

        double allFood = (foodDog1 + foodDog2 + foodDog3) * days;

        if (foodKg >= allFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodKg - allFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(allFood - foodKg));
        }
    }
}