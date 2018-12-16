package Exam1December;

import java.util.Scanner;

public class Pr4PuppyCareMiihaela {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodKg = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int eat = 0;

        while (!(input.equals("Adopted"))) {
            int gramsEat = Integer.parseInt(input);
            eat += gramsEat;

            input = scanner.nextLine();

        }

        int foodInGrams = foodKg * 1000;

        if (eat <= foodInGrams) {
            System.out.printf("Food is enough! Leftovers: %d grams.", Math.abs(foodInGrams - eat));
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(eat - foodInGrams));
        }
    }
}
