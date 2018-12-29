package Others1;

import java.util.Scanner;

public class Pr6ChristmasDecorationKiller95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budjet = Integer.parseInt(scanner.nextLine());
        double price;
        String nameObject = "";
        //moje da promenish uslovieto na "true"
        while (!nameObject.equals("Stop")) {
            nameObject = scanner.nextLine();
            if (nameObject.equals("Stop")) {
                System.out.printf("Money left: %.0f", budjet);
                return;
            }
            price = 0;
            for (int i = 0; i < nameObject.length(); i++) {
                price = price + nameObject.charAt(i);
            }
            if (price > budjet) {
                System.out.println("Not enough money!");
                return;
            }
            if (price <= budjet) {
                System.out.println("Item successfully purchased!");
            }
            budjet = budjet - price;
        }
    }
}


