package JavaBF;

import java.util.Scanner;

public class Pr15p186 {
    public static void main(String args[]) {
        String str = "";
        //StringBuilder str = new StringBuilder();
        int n, r, i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        while (n > 0) {
            r = n % 16;
            if (r == 10) {
                str = str + "A";
            } else if (r == 11) {
                str = str + "B";
            } else if (r == 12) {
                str = str + "C";
            } else if (r == 13) {
                str = str + "D";
            } else if (r == 14) {
                str = str + "E";
            } else if (r == 15) {
                str = str + "F";
            } else {
                str = str + r;
            }
            n = (int) n / 16;
        }
        for (i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}

//Тази програма трябва да се направи според мен (mirozspace) със стрингбилдер.
//Някой може ли да помогне и да я пренаправи?