package Java167;

import java.util.Scanner;

/*
Напишете програма, която прилага бонус точки към дадени точки в
интервала [1..9] чрез прилагане на следните правила:
- Ако точките са между 1 и 3, програмата ги умножава по 10.
- Ако точките са между 4 и 6, ги умножава по 100.
- Ако точките са между 7 и 9, ги умножава по 1000.
- Ако точките са 0 или повече от 9, се отпечатва съобщение за грешка.
 */
public class Pr8p168 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        if (n >= 1 && n <= 3) {
            sum = n * 10;
        }
        if (n >= 4 && n <= 6) {
            sum = n * 100;
        }
        if (n >= 7 && n <= 9) {
            sum = n * 1000;
        }
        if (n == 0 || n > 9) {
            System.out.println("Грешка!");
        }

        System.out.println(sum);
    }
}
