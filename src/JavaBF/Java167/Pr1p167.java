package JavaBF.Java167;

import java.util.Scanner;

/*
Да се напише if-конструкция, която изчислява стойността на две
целочислени променливи и разменя техните стойности,
ако стойността на първата променлива е по-голяма от втората.
 */
public class Pr1p167 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете стойността на \"а\": ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете стойността на \"b\": ");
        int b = Integer.parseInt(scanner.nextLine());
        int c;

        if (a > b) {
            c = a;
            a = b;
            b = c;
            System.out.println("Стойността на \"а\" е: " + a);
            System.out.println("Стойността на \"b\" е: " + b);
        } else {
            System.out.println("Стойността на \"а\" е: " + a);
            System.out.println("Стойността на \"b\" е: " + b);
        }
    }
}

/*package my_exam;

public class example_2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        int buffer;
        if (a > b) {
            buffer = b;
            b = a;
            a = buffer;
        } else {
            if (a == b) {
                String message = "Двете променливи са с една и съща стойност";
                message = "Стойността на първата променлива a е по-малка от променливата b";
                System.out.println(message);
            }
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}
//tuk sym*/