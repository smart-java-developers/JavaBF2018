package JavaBF.Java167;

import java.util.Scanner;

//ZA OPRAVENE
public class Pr3p167 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете стойността на \"а\": ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете стойността на \"b\": ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете стойността на \"c\": ");
        double c = Double.parseDouble(scanner.nextLine());

        if (a > b) {
            if (a > c) {
                System.out.println(a);
            }
        } else if (b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

        //====================================================================
        /*if (a > b) {
            if (a > c) {
                System.out.println("Най - голямото число е \"a\": " + a);
            }
        }
        if (b > a) {
            if (b > c) {
                System.out.println("Най - голямото число е \"b\": " + b);
            }
        }
        if (c > a) {
            if (c > b) {
                System.out.println("Най - голямото число е \"c\": " + c);
            }
        }*/
        //====================================================================
        /*
          double max = 0;
        if (a > b && a > c) {
            max = a;
        }else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }
         */
        //====================================================================
    }
}