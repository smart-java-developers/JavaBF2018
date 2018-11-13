// v2 Deianov

package JavaBF.Java167;

import java.util.Scanner;

public class Pr4p168v2Deianov {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Задайте цифра (0-9) : ");
                int num = Integer.parseInt(scanner.nextLine());
                if (num > -1 && num < 10) {
                    System.out.println(numberToName(num));
                    return;
                } else {
                    System.out.println("грешен вход!");
                }
            } catch (Exception e) {
                System.out.println("грешен вход!");
            }
        }
    }
    private static String numberToName (int fromNumber) {
        String names[] = {"нула", "едно", "две", "три", "четири", "пет", "шест", "седем", "осем", "девет"};
        return (fromNumber > -1 && fromNumber < 10) ? names[fromNumber] : "";
    }
}
