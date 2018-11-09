package java124;

import java.util.Scanner;

public class Pr13p125 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int b = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                b++;
            }
        }
        System.out.print("Числото " + num + " е ");
        if (b == 0) {
            System.out.print("просто");
        }else{
            System.out.print("съставно");
        }
    }
}