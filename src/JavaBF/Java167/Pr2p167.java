//Напишете програма, която показва знака (+ или -) от частното на две реални числа, без да го пресмята.

package JavaBF.Java167;

import java.util.Scanner;

public class Pr2p167 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете стойността на \"а\": ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете стойността на \"b\": ");
        double b = Double.parseDouble(scanner.nextLine());

        if (a > 0 && b > 0) {
            System.out.println("+");
        }
        if (a < 0 && b < 0) {
            System.out.println("+");
        }
        if ((a > 0) ^ (b > 0)) {
            System.out.println("-");
        }
        //if((a<0&&b>0)||!(a<0&&b>0))
        /*if (a / b > 0) {
            System.out.println("Знакът е: \"+\".");
        }
        if (a / b < 0) {
            System.out.println("Знакът е: \"-\".");
        }
        if (a / b == 0) {
            System.out.println("Знакът е: \"0\".");
        }*/


    }
}
