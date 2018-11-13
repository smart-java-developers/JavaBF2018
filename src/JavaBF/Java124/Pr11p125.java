package JavaBF.Java124;

import java.util.Scanner;

public class Pr11p125 {
    public static void main(String[] args) {
        //Дадено е число n и позиция p. Напишете поредица от операции,
        //които да отпечатат стойността на бита на позиция p от числото n (0 или 1).
        //Пример: n=35, p=5 -> 1. Още един пример: n=35, p=6 -> 0.
        Scanner input = new Scanner(System.in);
        System.out.print("Въведете произволно число: ");
        int n = input.nextInt();
        System.out.print("Въведете позиция: ");
        int p = input.nextInt();

        int i = 1; // 00000001
        int mask = i << p;

        System.out.println((n & mask) != 0 ? 1 : 0);
        input.close();
    }
}
