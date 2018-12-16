package Exam1December;

import java.util.Scanner;

public class Pr6MathPuzzleMiihaela {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (int a = 1; a <= 30; a++) {
            for (int b = 1; b <= 30; b++) {
                for (int c = 1; c <= 30; c++) {
                    int sumS = a + b + c;
                    int sumY = a * b * c;
                    if (sumS == num) {
                        if (a < b && a < c && b < c) {
                            count++;
                            System.out.println(a + " + " + b + " + " + c + " = " + num);
                        }
                    }
                    if (sumY == num)
                        if (a > b && a > c && b > c) {
                            count++;
                            System.out.println(a + " * " + b + " * " + c + " = " + num);
                        }
                }
            }
        }
        if (count == 0) {
            System.out.println("No!");
        }

    }
}
