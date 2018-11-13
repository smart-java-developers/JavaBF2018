package JavaBF.Java207;

import java.util.Scanner;

public class Pr2p207 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of \"Array1\": ");
        int length1 = Integer.parseInt(scanner.nextLine());
        int[] array1 = new int[length1];

        System.out.print("Enter length of \"Array2\": ");
        int length2 = Integer.parseInt(scanner.nextLine());
        int[] array2 = new int[length2];

        if (array1.length != array2.length) {
            System.out.println("The arrays are different!");
            return;
        }
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter index [" + i + "] on Arrays1: ");
            array1[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Enter index [" + i + "] on Arrays2: ");
            array2[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                System.out.println("The arrays are different!");
                return;
            }
        }
        System.out.println();
        System.out.println("The arrays are the same!");
        scanner.close();
    }
}