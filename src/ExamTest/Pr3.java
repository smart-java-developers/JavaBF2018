package ExamTest;

import java.util.Scanner;

public class Pr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfSushi = scanner.nextLine();
        String nameOfRestaurant = scanner.nextLine();
        int numberOfPortions = Integer.parseInt(scanner.nextLine());
        String order = scanner.nextLine();
        double price = 0;

        if (nameOfRestaurant.equals("Sushi Zone")) {
            if (typeOfSushi.equals("sashimi")) {
                price = 4.99;
            } else if (typeOfSushi.equals("maki")) {
                price = 5.29;
            } else if (typeOfSushi.equals("uramaki")) {
                price = 5.99;
            } else if (typeOfSushi.equals("temaki")) {
                price = 4.29;
            }
        } else if (nameOfRestaurant.equals("Sushi Time")) {
            if (typeOfSushi.equals("sashimi")) {
                price = 5.49;
            } else if (typeOfSushi.equals("maki")) {
                price = 4.69;
            } else if (typeOfSushi.equals("uramaki")) {
                price = 4.49;
            } else if (typeOfSushi.equals("temaki")) {
                price = 5.19;
            }
        } else if (nameOfRestaurant.equals("Sushi Bar")) {
            if (typeOfSushi.equals("sashimi")) {
                price = 5.25;
            } else if (typeOfSushi.equals("maki")) {
                price = 5.55;
            } else if (typeOfSushi.equals("uramaki")) {
                price = 6.25;
            } else if (typeOfSushi.equals("temaki")) {
                price = 4.75;
            }
        } else if (nameOfRestaurant.equals("Asian Pub")) {
            if (typeOfSushi.equals("sashimi")) {
                price = 4.5;
            } else if (typeOfSushi.equals("maki")) {
                price = 4.8;
            } else if (typeOfSushi.equals("uramaki")) {
                price = 5.50;
            } else if (typeOfSushi.equals("temaki")) {
                price = 5.50;
            }
        } else {
            System.out.printf("%s is invalid restaurant!", nameOfRestaurant);
            return;
        }
        if (order.equals("Y")) {
            price = price * numberOfPortions;
            price = price * 1.2;
        } else if (order.equals("N")) {
            price = price * numberOfPortions;
        }
        price = Math.ceil(price);
        System.out.printf("Total price: %.0f lv.", price);
    }
}
