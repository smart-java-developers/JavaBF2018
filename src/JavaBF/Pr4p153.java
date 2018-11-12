package JavaBF;

import java.util.Scanner;

public class Pr4p153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int count1 = 0;

        for (int i = num1 + 1; i < num2; i++) {
            if (i % 5 == 0) {
                count1++;
            }
        }
        System.out.println(count1);
    }
}
/*
Напишете програма, която чете от конзолата две цели числа (integer) и отпечатва,
колко числа има между тях, такива, че остатъкът им от деленето на 5 да е 0.
*/