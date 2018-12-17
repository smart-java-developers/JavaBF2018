package Exam1December;

import java.util.Scanner;

public class Pr5ProjectPrizeMirozSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int parts = Integer.parseInt(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        int allPoints = 0;

        for (int i = 1; i <= parts; i++) {
            int point = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                allPoints = allPoints + (point * 2);
            } else {
                allPoints = allPoints + point;
            }
        }
        double allMoney = money * allPoints;
        System.out.printf("The project prize was %.2f lv.", allMoney);
    }
}