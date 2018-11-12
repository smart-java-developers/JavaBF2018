package JavaBF;

import java.util.Scanner;

public class Pr5p125 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();

        System.out.print("b = ");
        int b = scanner.nextInt();

        int p, s;

        p = 2 * (a + b);

        s = a * b;
        System.out.println("Периметър = " + p + "см");
        System.out.println("Лице = " + s + "см");
        scanner.close();
    }

}
