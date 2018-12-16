package Exam1December;

import java.util.Scanner;

public class Pr4EverestMiihaela {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int startMetars = 5364;
        int deys = 1;

        while (true) {
            int meters = Integer.parseInt(scanner.nextLine());
            if (input.equals("Yes")) {
                deys++;
            }
            startMetars += meters;
            if (deys >= 5) {
                break;
            }
            input = scanner.nextLine();

            if (input.equals("END")) {
                break;
            }
            if (startMetars >= 8848) {
                break;
            }

        }
        if (startMetars >= 8848) {
            System.out.printf("Goal reached for %d days!", deys);
        } else {
            System.out.println("Failed!");
            System.out.println(startMetars);
        }

    }
}
