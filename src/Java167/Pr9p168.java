package Java167;

import java.util.Scanner;

public class Pr9p168 {
    public static void main(String[] args) {
        int number = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Моля въведе число между 0-999 или -1 за изход: ");
        number = Integer.parseInt(scanner.nextLine());

        if (number >= 0 && number <= 999) {
            if (number == 0) {
                System.out.print("Числото в текстов формат е:\tНула");
            } else {
                System.out.print("Числото в текстов формат е:\t");
                numberToWord(((number / 100) % 10), " Сто");
                numberToWord((number % 100), " ");
            }
        } else {
            System.out.print("Извън обхват");
        }
    }

    public static void numberToWord(int num, String val) {

        String ones[] = {" ", " едно", " две", " три", " четири", " пет", " шест", " седем", " осем", " девет",
                " десет", " единадесет", " дванайсет", " трийнасет", " четирийнайсет", " петнайсет", " шестнайсет",
                " седемнайсет", " осемнайсет", " деветнайсет"
        };

        String tens[] = {" ", " ", " двадесет", " тридесет", " четиредесет", " педесет", " шейсет", " седемдесет",
                " осемдесет", " деведесет"};

        if (num > 19) {
            System.out.print(tens[num / 10] + " " + ones[num % 10]);
        } else {
            System.out.print(ones[num]);
        }
        if (num > 0) {
            System.out.print(val);
        }
    }
}