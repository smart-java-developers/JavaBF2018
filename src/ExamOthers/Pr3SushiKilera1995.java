package ExamOthers;

import java.util.Scanner;

public class Pr3SushiKilera1995 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sushiType = scanner.nextLine();
        String nameRestaurant = scanner.nextLine();
        int porcion = Integer.parseInt(scanner.nextLine());
        char symbol = scanner.nextLine().charAt(0);
        double price = 0;

        switch (nameRestaurant) {
            case "Sushi Zone":
                switch (sushiType) {
                    case "sashimi":
                        price = 4.99;
                        break;
                    case "maki":
                        price = 5.29;
                        break;
                    case "uramaki":
                        price = 5.99;
                        break;
                    case "temaki":
                        price = 4.29;
                        break;
                }
                break;
            case "Sushi Time":
                switch (sushiType) {
                    case "sashimi":
                        price = 5.49;
                        break;
                    case "maki":
                        price = 4.69;
                        break;
                    case "uramaki":
                        price = 4.49;
                        break;
                    case "temaki":
                        price = 5.19;
                        break;
                }
                break;
            case "Sushi Bar":
                switch (sushiType) {
                    case "sashimi":
                        price = 5.25;
                        break;
                    case "maki":
                        price = 5.55;
                        break;
                    case "uramaki":
                        price = 6.25;
                        break;
                    case "temaki":
                        price = 4.75;
                        break;
                }
                break;
            case "Asian Pub":
                switch (sushiType) {
                    case "sashimi":
                        price = 4.50;
                        break;
                    case "maki":
                        price = 4.80;
                        break;
                    case "uramaki":
                        price = 5.50;
                        break;
                    case "temaki":
                        price = 5.50;
                        break;
                }

                break;
            default:
                System.out.println(nameRestaurant + "is invalid restaurant!");
                return;
        }
        price = price * porcion;
        if (symbol == 'Y') {
            price = Math.ceil(price * 1.20);
        }
        System.out.printf("Total price: %.2f lv.", price);
    }
}
