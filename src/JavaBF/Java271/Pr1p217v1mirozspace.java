package JavaBF.Java271;

import java.util.Scanner;

public class Pr1p217v1mirozspace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Fahrenheit degrees: ");
        double temperatureFahrenheit = Double.parseDouble(scanner.nextLine());

        double temperature = convertFahrenheitToCelsius(temperatureFahrenheit);
        System.out.printf("Temperature in Celsius degrees is %.2f%n", temperature);
        if (temperature >= 37) {
            System.out.println("You are ill!");
        }
        scanner.close();
    }
    //Метода е private защото не е нужно да е public, поради причината, че самоият метод е
    //в класа където е и основния мето меин

    private static double convertFahrenheitToCelsius(double temperatureFahrenheit) {
        return (temperatureFahrenheit - 32) * 5 / 9;
    }
}