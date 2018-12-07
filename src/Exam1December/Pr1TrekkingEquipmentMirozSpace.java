package Exam1December;

import java.util.Scanner;

public class Pr1TrekkingEquipmentMirozSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mountaineers = Integer.parseInt(scanner.nextLine());
        int carabiners = Integer.parseInt(scanner.nextLine());
        int ropes = Integer.parseInt(scanner.nextLine());
        int pickeys = Integer.parseInt(scanner.nextLine());

        double total = (carabiners * 36 + ropes * 3.6 + pickeys * 19.8) * mountaineers;
        total = total * 1.2;

        System.out.printf("%.2f", total);
    }
}