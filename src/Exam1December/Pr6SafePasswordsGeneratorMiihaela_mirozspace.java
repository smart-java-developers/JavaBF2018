package Exam1December;

import java.util.Scanner;

public class Pr6SafePasswordsGeneratorMiihaela_mirozspace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int numPassword = Integer.parseInt(scanner.nextLine());
        int count1 = 0;
        int count2 = 0;
        int sum = a * b;
        for (char i = 35; i < 55; i++) {
            for (char j = 64; j < 96; j++) {
                for (int k = 1; k <= a; k++) {
                    for (int l = 1; l <= b; l++) {
                        System.out.printf("%s%s%d%d%s%s|", i, j, k, l, j, i);
                        j++;
                        i++;

                        if (i > 55) {
                            i = 35;
                        }
                        if (j > 96) {
                            j = 64;
                        }
                        if (sum <= numPassword) {
                            count1++;
                            if (count1 == sum) {
                                return;
                            }
                        }
                        if (sum > numPassword) {
                            count2++;
                            if (count2 == numPassword) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
