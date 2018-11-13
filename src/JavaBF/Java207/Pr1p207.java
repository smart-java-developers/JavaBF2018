package JavaBF.Java207;

import java.util.Scanner;

public class Pr1p207 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 5;
            System.out.print(array[i] + " ");
        }
    }
}