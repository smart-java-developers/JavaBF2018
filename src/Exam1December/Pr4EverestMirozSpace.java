package Exam1December;

import java.util.Scanner;

public class Pr4EverestMirozSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countDays = 1;
        int height = 5364;

        while (true) {
            String sleep = scanner.nextLine();
            if (sleep.equals("END")) {
                break;
            }
            int meters = Integer.parseInt(scanner.nextLine());
            if (sleep.equals("Yes")) {
                countDays++;
            }
            if (countDays > 5) break;
            height += meters;
            if (height >= 8848) {
                break;
            }
        }

        if (height >= 8848) {
            System.out.printf("Goal reached for %d days!", countDays);
        } else {
            System.out.println("Failed!");
            System.out.printf("%d", height);
        }
    }
}

