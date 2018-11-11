package ExamTest;

import java.util.Scanner;

public class Pr6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        //325
        int result;

        int digit1 = num % 10;//5
        num = num / 10; //32
        int digit2 = num % 10; //2
        num = num / 10; //3
        int digit3 = num % 10;//3

        for (int i = 1; i <= digit1; i++) {
            for (int j = 1; j <= digit2; j++) {
                for (int k = 1; k <= digit3; k++) {
                    result = i * j * k;
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, result);
                }
            }
        }
    }
}
