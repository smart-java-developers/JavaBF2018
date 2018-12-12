package Exam1December;

import java.util.Scanner;

public class Pr1TrekkingEquipmentMiihaela {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mountaineers = Integer.parseInt(scanner.nextLine());
        int karabineri = Integer.parseInt(scanner.nextLine());
        int rope = Integer.parseInt(scanner.nextLine());
        int pikeli = Integer.parseInt(scanner.nextLine());

        double priceKarabineri = karabineri * 36;
        double priceRope = rope * 3.60;
        double pricePrkeli = pikeli * 19.80;
        double priceForOneMountaineers = priceKarabineri + priceRope + pricePrkeli;
        double priceForAllMountaineers = priceForOneMountaineers * mountaineers;
        double totalPrice = priceForAllMountaineers * 1.20;

        System.out.printf("%.2f", totalPrice);
    }
}
