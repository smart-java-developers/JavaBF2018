package Others1;

import java.util.Scanner;

public class Pr1OperaciiSCifri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int a = num / 1000;
        int b = (num / 100) % 10;
        int c = (num / 10) % 10;
        int d = num % 10;

        System.out.println(a + b + c + d);
        System.out.printf("%d%d%d%d%n", d, c, b, a);
        System.out.printf("%d%d%d%d%n", d, a, b, c);
        System.out.printf("%d%d%d%d", a, c, b, d);
    }
}

/*
Напишете програма, която приема за вход четирицифрено число във формат abcd и след това извършва следните действия върху него:
- Пресмята сбора от цифрите на числото.
- Разпечатва на конзолата цифрите в обратен ред: dcba.
- Поставя последната цифра, на първо място: dabc.
- Разменя мястото на втората и третата цифра: acbd.
*/