package ExamTest;

import java.util.Scanner;

public class Pr5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allPassengers = Integer.parseInt(scanner.nextLine());
        int numberOfStops = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfStops; i++) {
            int passengersComingDown = Integer.parseInt(scanner.nextLine());
            int boardingPassengers = Integer.parseInt(scanner.nextLine());

            allPassengers = allPassengers + boardingPassengers - passengersComingDown;

            if (i % 2 != 0) {
                allPassengers = allPassengers + 2;
            } else if (i % 2 == 0) {
                allPassengers = allPassengers - 2;
            }
        }
        System.out.printf("The final number of passengers is : %d", allPassengers);
    }
}