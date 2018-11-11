import java.util.Scanner;

public class Pr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String timeContract = scanner.nextLine();
        String typeContract = scanner.nextLine();
        String dessert = scanner.nextLine();
        int numberOfMonth = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (timeContract.equals("one")) {
            if (typeContract.equals("Small")) {
                price = 9.98;
            } else if (typeContract.equals("Middle")) {
                price = 18.99;
            } else if (typeContract.equals("Large")) {
                price = 25.98;
            } else if (typeContract.equals("ExtraLarge")) {
                price = 35.99;
            }
        } else if (timeContract.equals("two")) {
            if (typeContract.equals("Small")) {
                price = 8.58;
            } else if (typeContract.equals("Middle")) {
                price = 17.09;
            } else if (typeContract.equals("Large")) {
                price = 23.59;
            } else if (typeContract.equals("ExtraLarge")) {
                price = 31.79;
            }
        }

        if (dessert.equals("yes")) {
            if (price <= 10) {
                price = price + 5.50;
            } else if (price <= 30) {
                price = price + 4.35;
            } else if (price > 30) {
                price = price + 3.85;
            }
        }

        if (timeContract.equals("two")) {
            price = price - (price * 0.0375);
        }
        price = price * numberOfMonth;

        System.out.printf("%.2f lv.", price);

    }
}