// v.1.1 Deianov

package JavaBF.Java167;

import java.util.Scanner;

public class Pr4p168Deianov {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Задайте цифра (0-9) : ");
                int num = Integer.parseInt(scanner.nextLine());
                System.out.println(numberToName(num));
                return;
            } catch (NumberFormatException e) {
                System.out.println("грешен вход!");
            }
        }
    }
    private static String numberToName (int fromNumber) {
        String names[] = {"нула", "едно", "две", "три", "четири", "пет", "шест", "седем", "осем", "девет"};
        return (fromNumber > -1 && fromNumber < 10) ? names[fromNumber] : "грешен вход!";
    }
}
