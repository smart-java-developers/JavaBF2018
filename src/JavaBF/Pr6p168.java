package JavaBF;

import java.util.Scanner;

public class Pr6p168 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numMax = Double.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            double num = Double.parseDouble(scanner.nextLine());
            if (num > numMax) {
                numMax = num;
            }
        }
        System.out.println(numMax);
    }
}