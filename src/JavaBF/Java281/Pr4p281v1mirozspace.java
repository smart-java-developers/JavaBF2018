package JavaBF.Java281;
//Програмата извежда колко пъти дадено число се среща в дадения васив.

import java.util.Scanner;

public class Pr4p281v1mirozspace {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of array elements: ");
            int arrayN = Integer.parseInt(scanner.nextLine());

            int[] array = new int[arrayN];
            for (int i = 0; i < array.length; i++) {
                System.out.print("Enter index [" + i + "] on Arrays1: ");
                array[i] = Integer.parseInt(scanner.nextLine());
            }
            System.out.print("Enter the search number in the array: ");
            int num = Integer.parseInt(scanner.nextLine());
            searchingInArray(num, array);
            scanner.close();

        }catch (Exception e){
            System.out.println("Input Error!");
        }
    }

    private static void searchingInArray(int num, int[] array) {
        int count = 0;
        //Трябва дас е направи корекция на този файл.
        //Махнате неща не ги трийте, а ги коментирайте.
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                count++;
            }
        }
        System.out.printf("Searched number \"%d\" is contained %d in the array", num, count);
    }
}

//Някой ако може да коригира фора, понеже се ползвало foreach!!!