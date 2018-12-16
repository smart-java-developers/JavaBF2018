package Exam1December;

import java.util.Scanner;

public class Pr5ProjectPrizeMiihaela {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int parst = Integer.parseInt(scanner.nextLine());
        double moneyForOnePoint = Double.parseDouble(scanner.nextLine());
        int pointOdd = 0;
        int pointEven = 0;
        int allPoint = 0;

        for (int i = 1; i <= parst; i++) {
            int pointForEtap = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                pointEven += pointForEtap * 2;
            } else {
                pointOdd += pointForEtap;
            }
        }
        allPoint = pointEven + pointOdd;
        double allMoney = moneyForOnePoint * allPoint;
        System.out.printf("The project prize was %.2f lv.", allMoney);

    }
}
