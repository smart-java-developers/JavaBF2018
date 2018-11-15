/*
Crooked Digits

        The crooked digit of a given number N is calculated using the number's digits in a very weird and bendy algorithm. The algorithm takes the following steps:

        Sums the digits of the number N and stores the result back in N.
        If the obtained result is bigger than 9, step 1. is repeated, otherwise the algorithm finishes.

        The last obtained value of N is the result, calculated by the algorithm.

        Input
        The input data should be read from the console.
        The only line in the input contains a number N, which can be an integer or real number (decimal fraction), positive or negative.
        The input data will always be valid and in the format described. There is no need to check it explicitly.

        Output
        The output data should be printed on the console.
        You must print the calculated crooked digit of the number N on the first and only line of the output.

        Constraints
        The number N will have no more than 300 digits before and after the decimal point.
        The decimal separator will always be the "." symbol.
*/
package Others1;

import java.util.Scanner;

public class CrookedDigitsV1Deianov {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int rest = 0;
        int d;
        int f = 0;
        boolean flag = false;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            f = c == 46 ? 0 : f + 1;
            if (f < 301 && c > 47 && c < 58) {
                d = c - 48;
                rest = rest + d > 9 ? d : rest + d;
                flag = true;
            }
        }
        if (flag && rest < 10) System.out.println(rest);
    }
}
