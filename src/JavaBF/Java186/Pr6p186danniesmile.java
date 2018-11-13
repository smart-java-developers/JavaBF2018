package JavaBF.Java186;


import java.util.Scanner;

public class Pr6p186danniesmile {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int first = 0;
        int second = 1;

        System.out.println("How many elements you want to print in a Fibonacci series");
        int n = scanner.nextInt();

        System.out.println("Fibonacci series");
        System.out.print(first + " "+ second + " ");

        int next;

        //Start a loop from second index
        int i = 2;

        //while i is less than the value of n
        while(i < n) {

            next = first + second;

            System.out.print(next + " ");

            first = second;
            second = next;

            //increment the value of i
            i++;
        }
    }
}
