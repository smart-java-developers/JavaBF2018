package Java186;

import java.util.Scanner;

public class pr186_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (n < 1) {
            System.out.println("0");
        } else {
            int first = 0;
            int second = 1;
            int third;
            System.out.print(first + ", ");
            System.out.print(second + ", ");
            for (int i = 2; i < n; i++) {
                third = first + second;
                System.out.print(third + ", ");
                first = second;
                second = third;
            }
        }
    }
}


/*Напишете програма, която чете от конзолата числото N и отпечатва
сумата на първите N члена от редицата на Фибоначи: 0, 1, 1, 2, 3, 5, 8,
13, 21, 34, 55, 89, 144, 233, 377, ...
 */