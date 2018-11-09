package java124;

import java.util.Scanner;

public class Pr10p125 {
    public static void main(String[] args) {
        //10. Напишете програма, която приема за вход четирицифрено число във формат abcd и след това извършва следните действия върху него:
        //- Пресмята сбора от цифрите на числото.
        //- Разпечатва на конзолата цифрите в обратен ред: dcba.
        //- Поставя последната цифра, на първо място: dabc.
        //- Разменя мястото на втората и третата цифра: acbd.
        //1234
        //abcd
        Scanner input = new Scanner(System.in);
        System.out.print("Въведете четирицифрено число формат abcd ->1234-<: ");
        int x = input.nextInt();

        int a;
        int b;
        int c;
        int d;
        int e;

        d = x % 10;
        c = (x / 10) % 10;
        b = (x / 100) % 10;
        a = (x / 1000) % 10;

        e = a + b + c + d;
        System.out.println("Сборът на цифрите на числото е: " + e);
        String string1 = "Числото записано в обратен ред е: " + d + c + b + a;
        System.out.println(string1);
        //Поставя последната цифра, на първо място: dabc.
        String string2 = "Числото записано във формат dabc е: " + d + a + b + c;
        System.out.println(string2);
        String string3 = "Числото записано във формат acbd е: : " + a + c + b + d;
        System.out.println(string3);
        input.close();

        input.close();

    }

}
