package JavaBF.Java186;

import java.util.Scanner;

public class Pr5p186 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (n < 1) {
            System.out.println("0");
        } else {
            int first = 0;
            int second = 1;
            int third;
            System.out.print(first + ", ");
            System.out.print(second + ", ");
            for (int i = 2; i < n; i++) {
                third = first + second;
                System.out.print(third + ", ");
                first = second;
                second = third;
            }
        }
    }
}