package JavaBF.Java167;

import java.util.Scanner;

public class Pr7p168 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        boolean m = false;

        if (num1 + num2 == 0) {
            m = true;
        } else if (num1 + num3 == 0) {
            m = true;
        } else if (num2 + num3 == 0) {
            m = true;
        }
        if (m) {
            System.out.println("Има подмножества със сума 0!");
        } else {
            System.out.println("Няма подмножества със сума 0!");
        }

    }
}
/*
Дадени са няколко цели числа. Напишете програма, която намира онези
подмножества от тях, които имат сума 0. Примери:
- Ако са дадени числата {-2, -1, 1}, сумата на -1 и 1 е 0.
- Ако са дадени числата {3, 1, -7}, няма подмножества със сума 0.
 */