package Exam1December;

import java.util.Scanner;

public class Pr1SchoolSuppliesMirozSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int packagePens = Integer.parseInt(scanner.nextLine());
        int packegeMerkets = Integer.parseInt(scanner.nextLine());
        double cleaningDetergent = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double total = packagePens * 5.8 + packegeMerkets * 7.2 + cleaningDetergent * 1.2;
        total = total - (total * (discount * 1.0 / 100));

        System.out.printf("%.3f", total);
    }
}