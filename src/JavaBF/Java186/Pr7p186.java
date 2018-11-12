package JavaBF.Java186;

import java.util.Scanner;

public class Pr7p186 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());
        int nk = n - k;
        for (int i = n - 1; i > 0; i--) {
            n = n * i;
        }
        for (int i = k - 1; i > 0; i--) {
            k = k * i;
        }
        for (int i = nk - 1; i > 0; i--) {
            nk = nk * i;
        }
        System.out.println("Result is: " + (n * k / nk));

    }
}
