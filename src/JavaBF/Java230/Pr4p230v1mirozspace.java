package JavaBF.Java230;
//Програма за преобразуване на число от десетично в двуично
//Хубаво е да се направи със стринг Билдер.

import java.util.Scanner;

public class Pr4p230v1mirozspace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter decimal number: ");
        int num = Integer.parseInt(scanner.nextLine());

        if (num == 0) {
            System.out.println("0");
            return;
        }
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            int numM = num % 2;
            sb.append(numM);
            num = num / 2;
        }
        System.out.println(sb.reverse());
    }
}

//Някой ако може да промени кода и на изхода да има 8 водещи нули. :)