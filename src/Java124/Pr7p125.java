package Java124;

import java.util.Scanner;

public class Pr7p125 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Въведете килограмите на човек:");
        int kg = input.nextInt();

        double kgl;
        kgl = kg*0.17;
        System.out.print("Човек стъпил на Луната ще тежи: "+ kgl +" кг.");
        input.close();
    }

}
