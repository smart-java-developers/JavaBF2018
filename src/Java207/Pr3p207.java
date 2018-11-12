package Java207;

import java.util.Scanner;

public class Pr3p207 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean arrayEqual = true;
        char[] array1 = {'a', 'b', 'k', 'd', 'c', 'm', 'n'};
        char[] array2 = {'a', 'b', 'k', 'd', 'c', '5', 'n'};

        if (array1.length > array2.length) {
            System.out.println("Second array is lexicographicaly first.");
        } else if (array1.length < array2.length) {
            System.out.println("First array is lexicographicaly first.");
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] < array2[i]) {
                    System.out.println("First array is lexicographicaly first.");
                    arrayEqual = false;
                    break;
                }
                if (array1[i] > array2[i]) {
                    System.out.println("Second array is lexicographicaly first.");
                    arrayEqual = false;
                    break;
                }
            }
            if (arrayEqual) {
                System.out.println("Arrays are lexicographicaly equal.");
            }
        }
    }
}