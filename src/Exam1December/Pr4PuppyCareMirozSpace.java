package Exam1December;

import java.util.Scanner;

public class Pr4PuppyCareMirozSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allfood = 0;

        int food = Integer.parseInt(scanner.nextLine()) * 1000;
        while (true) {
            String gramsStr = scanner.nextLine();
            if (gramsStr.equals("Adopted")) break;
            int grams = Integer.parseInt(gramsStr);
            allfood += grams;
        }
        if (food >= allfood) {
            System.out.printf("Food is enough! Leftovers: %d grams.", food - allfood);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", allfood - food);
        }
    }
}