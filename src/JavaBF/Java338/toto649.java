package JavaBF.Java338;

import java.util.Random;
import java.util.Scanner;

public class toto649 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете брой тегления: ");
        int count = Integer.parseInt(scanner.nextLine());
        String text = "";
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            for (int number = 1; number <= 6; number++) {
                int randomNumber = rand.nextInt(49) + 1;
                System.out.printf("%d ", randomNumber);
            }
            System.out.println();
            if (i == (count - 1)) {
                System.out.print("Това беше последното теглене!");
                System.exit(0);
            }else{
                System.out.print("Ако искате да продължите изпълнението на програмата натиснете \"Y\" :");
                text = scanner.nextLine();
            }
            if (!(text.equalsIgnoreCase("Y"))) {
                System.out.println("Край на играта");
                System.exit(0);
            }
        }
        scanner.close();
    }
}