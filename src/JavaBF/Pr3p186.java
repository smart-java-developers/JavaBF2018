package JavaBF;

import java.util.Scanner;

public class Pr3p186 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете броя ставнявани числа: ");
        int n = Integer.parseInt(scanner.nextLine());
        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print("Въведете число: ");
            double num = Double.parseDouble(scanner.nextLine());
            if (num > max) {
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        System.out.println("Най - голямото число е: " + max);
        System.out.println("Най - малкото число е: " + min);
    }
}