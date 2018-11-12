package JavaBF.Java124;

import java.util.Scanner;

public class Pr6p125 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("h = ");
        int h = scanner.nextInt();
        int s;

        s = ((a + b) / 2) * h;
        System.out.println("Лицето на трапеца е: " + s);
        scanner.close();
    }

}
