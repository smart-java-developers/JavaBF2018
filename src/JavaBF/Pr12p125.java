package JavaBF;

import java.util.Scanner;

public class Pr12p125 {
    public static void main(String[] args) {
        /*Дадено е число n, стойност v (v = 0 или 1) и позиция p.
        Напишете поредица от операции, които да променят стойността на n,
        така че битът на позиция p да има стойност v. Пример n=35, p=5, v=0 -> n=3.
        Още един пример: n=35, p=2, v=1 -> n=39.*/

        Scanner input = new Scanner(System.in);
        System.out.print("Въведете произволно число: ");
        int n = input.nextInt();
        System.out.print("Въведете позиция: ");
        int p = input.nextInt();
        System.out.print("Въведете нова стойност на позицията: ");
        int v = input.nextInt();

        if (v==0) {
            n = n & (~(1 << p));
        }else{
            n = n | (1 << p);
        }
        System.out.println(n);
    }
}
