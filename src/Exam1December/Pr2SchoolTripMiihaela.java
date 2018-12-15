package Exam1December;

import java.util.Scanner;

public class Pr2SchoolTripMiihaela {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int food = Integer.parseInt(scanner.nextLine());
        double dog1 = Double.parseDouble(scanner.nextLine());
        double dog2 = Double.parseDouble(scanner.nextLine());
        double dog3 = Double.parseDouble(scanner.nextLine());

        double foodForDog1 = days * dog1;
        double foodForDog2 = days * dog2;
        double foodForDog3 = days * dog3;

        double all = Math.ceil(foodForDog1 + foodForDog2 + foodForDog3);

        if (food >= all) {
            System.out.printf("%d kilos of food left.", Math.abs((int) all - food));
        } else {
            System.out.printf("%d more kilos of food are needed.", Math.abs((int) all - food));
        }
    }
}
