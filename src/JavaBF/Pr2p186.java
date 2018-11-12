package JavaBF;
/*
2. Напишете програма, която отпечатва на конзолата числата от 1 до N,
които не се делят на 3 и 7. Числото N се чете от стандартния вход.
 */

import java.util.Scanner;

public class Pr2p186 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 7 != 0){
                System.out.println(i);
            }
        }
    }
}
