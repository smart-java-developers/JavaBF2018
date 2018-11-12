// v.1 Deianov

package JavaBF.Java167;

import java.util.Scanner;

public class Pr4p168v1deianov {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Задайте цифра (0-9) : ");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println(numberToName(num));
    }
    private static String numberToName (int fromNumber) {
        String names[] = {"нула", "едно", "две", "три", "четири", "пет", "шест", "седем", "осем", "девет",};
        return (fromNumber > -1 && fromNumber < 10) ? names[fromNumber] : "грешен вход!";
    }
}
