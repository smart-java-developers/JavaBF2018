package Others1;

import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeopleOnDeparture = Integer.parseInt(scanner.nextLine());
        int busStops = Integer.parseInt(scanner.nextLine());

        int totalPassengers = 0;

        for (int i = 1; i <= busStops; i++) {
            int peopleOut = Integer.parseInt(scanner.nextLine());
            int peopleIn = Integer.parseInt(scanner.nextLine());
            totalPassengers += peopleIn;


            if (i % 2 != 0) {
                totalPassengers += 2;
            } else if (i % 2 == 0) {
                totalPassengers -= 2;
            }

            countPeopleOnDeparture -= peopleOut;
            countPeopleOnDeparture += totalPassengers;

        }
        System.out.println(countPeopleOnDeparture);
    }
}
