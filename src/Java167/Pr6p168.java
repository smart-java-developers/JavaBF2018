package Java167;

import java.util.Scanner;

public class Pr6p168 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете броя ставнявани числа: ");
        int n = Integer.parseInt(scanner.nextLine());
        double max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print("Въведете число: ");
            double num = Double.parseDouble(scanner.nextLine());
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Най - голямото число е: " + max);

        //По-лошото решение!!!
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете число 1: ");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете число 2: ");
        double num2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете число 3: ");
        double num3 = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете число 4: ");
        double num4 = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете число 5: ");
        double num5 = Double.parseDouble(scanner.nextLine());

        System.out.println();

        if (num1 == num2 && num1 == num3 && num1 == num4 && num1 == num5) {
            System.out.println("Всички числа са еднакви!");
        }
        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
            System.out.println(num2);
        } else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
            System.out.println(num3);
        } else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
            System.out.println(num4);
        } else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
            System.out.println(num5);
        }*/
    }
}