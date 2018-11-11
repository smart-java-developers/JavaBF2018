package ExamTest;

import java.util.Scanner;

public class Pr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceFood = Double.parseDouble(scanner.nextLine());
        double souvenirs = Double.parseDouble(scanner.nextLine());
        double priceHotelForDay = Double.parseDouble(scanner.nextLine());

        int km = 210;
        km = km * 2;

        double gasoline = km * 1.0 / 100 * 7;
        double priceGasoline = gasoline * 1.85;
        double priceFoodAndSouvenirs = 3 * priceFood + 3 * souvenirs;
        double priceHotel = priceHotelForDay * 0.9 + priceHotelForDay * 0.85 + priceHotelForDay * 0.8;

        System.out.printf("Money needed: %.2f", (priceGasoline + priceFoodAndSouvenirs + priceHotel));
    }
}
