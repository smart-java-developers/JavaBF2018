package Exam1December;

import java.util.Scanner;

public class Pr1SchoolSuppliesMiihaela {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pen = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        double preparation = Double.parseDouble(scanner.nextLine());
        int coasting = Integer.parseInt(scanner.nextLine());

        double pricePen = pen * 5.80;
        double priceMarkers = markers * 7.20;
        double pricePreparation = preparation * 1.20;

        double priceAll = pricePen + priceMarkers + pricePreparation;

        double totalPrice = priceAll - ((priceAll * coasting) / 100);

        System.out.printf("%.3f", totalPrice);


    }
}
