package Others1;

import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double totalRate = 0;
        double totalSales = 0;

        for (int i = 1; i <= n; i++) {
            int comps = Integer.parseInt(scanner.nextLine());
            int rate = comps % 10;
            int sales = comps / 10;
            totalRate += rate;
            if (rate == 3) {
                totalSales += sales * 0.50;
            } else if (rate == 4) {
                totalSales += sales * 0.70;
            } else if (rate == 5) {
                totalSales += sales * 0.85;
            } else if (rate == 6) {
                totalSales += sales;
            }
        }

        double average = totalRate / n;
        System.out.printf("%.2f%n", totalSales);
        System.out.printf("%.2f", average);

    }
}

//Работещ код от mirozspace
/*
import java.util.Scanner;

public class pr5ComputerCompany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int reviewedComputers = Integer.parseInt(scanner.nextLine());

        double ratingAll = 0;
        int possibleSales = 0;
        double allSales = 0;
        double allSalesPc = 0;
        int raiting = 0;

        for (int i = 0; i < reviewedComputers; i++) {

            int numberForPc = Integer.parseInt(scanner.nextLine());
            raiting = numberForPc % 10;

            if (raiting == 2) {
                allSales = 0;
            } else if (raiting == 3) {
                possibleSales = numberForPc / 10;
                allSales = possibleSales * 0.5;
            } else if (raiting == 4) {
                possibleSales = numberForPc / 10;
                allSales = possibleSales * 0.7;
            } else if (raiting == 5) {
                possibleSales = numberForPc / 10;
                allSales = possibleSales * 0.85;
            } else if (raiting == 6) {
                allSales = numberForPc * 1.0 / 10;
                //allSales = (double) (numberForPc / 10);
            }

            allSalesPc = allSalesPc + allSales;
            ratingAll = ratingAll + raiting;

        }

        ratingAll = ratingAll / reviewedComputers;
        allSalesPc = Math.floor(allSalesPc);
        if (raiting >= 2 && raiting <= 6) {
            System.out.printf("%.2f%n", allSalesPc);
            System.out.printf("%.2f%n", ratingAll);
        }
    }
}
 */