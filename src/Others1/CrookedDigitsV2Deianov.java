// Crooked Digits by Methods and Recursion

package Others1;

import java.util.Scanner;

public class CrookedDigitsV2Deianov {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(calculateResult(readDigits(scanner.nextLine())));
    }

    private static int readDigits(String num) {
        int d = num.charAt(0);
        d = (d > 48 && d < 58) ? (d - 48) : 0;
        if (num.length() < 2) {
            return d;
        } else {
            return d + readDigits(num.substring(1));
        }
    }

    private static int calculateResult (int num) {
        if (num < 10) {
            return num;
        } else {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            return calculateResult(sum);
        }
    }
}
