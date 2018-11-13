package JavaBF.Java281;
//Програмата връща най - голямото от три цели числа.
//Използва се метод създаден от нас.
import java.util.Scanner;

public class Pr2p281v1mirozspace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(getMax(getMax(num1,num2),num3));

        scanner.close();
    }

        private static int getMax(int num1, int num2) {
        int maxNum = num1;
        if (maxNum < num2) {
            maxNum = num2;
        }
        return maxNum;
    }

}