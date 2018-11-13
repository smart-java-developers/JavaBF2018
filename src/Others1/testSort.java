package Others1;

import static JavaBF.Java271.Pr1p278v1Deianov.sortNumbers;

public class testSort {
    public static void main(String[] args) {
        int[] arrInteger = {4, 3, 1, 5, 2, 0};
        for (int i: sortNumbers(arrInteger)) {
            System.out.print(i + " ");
        }
        System.out.println();
        double[] arrDouble = {1.5, 3.5, 5.0, 0.0};
        for (double d: sortNumbers(arrDouble)) {
            System.out.print(d + " ");
        }
        System.out.println();
        for (int i: sortNumbers(1, 2, 5, 6, 7, 4, 8, 0, 3, 9, 10)) {
            System.out.print(i + " ");
        }
    }
}
