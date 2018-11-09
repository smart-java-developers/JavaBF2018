package Java167;

import java.util.Scanner;

/*
Напишете програма, която при въвеждане на коефициентите (a, b и c)
на квадратно уравнение: 2 ax  bx  c , изчислява и извежда неговите
реални корени.
 */
public class Pr5p168 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        double d, x, x1, x2;

        d = Math.pow(b, 2) - 4 * a * c;

        if (d > 0) {
            x1 = (-b + (Math.sqrt((Math.pow(b, 2) - 4 * a * c)))) / 2 * a;
            x2 = (-b - (Math.sqrt((Math.pow(b, 2) - 4 * a * c)))) / 2 * a;
            System.out.println(x1);
            System.out.println(x2);
        }
        if (d < 0) {
            System.out.println("Квадратното уравнение няма реакни корени");
        }
        if (d == 0) {
            x = -(b / 2 * a);
            System.out.println(x);
        }


    }
}
