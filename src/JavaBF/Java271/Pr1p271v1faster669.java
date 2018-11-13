package JavaBF.Java271;

/* Задача:

Конзолен конвертор: от градуси °C към градуси °F
Напишете програма, която чете градуси по скалата на Целзий (°C) и ги преобразува до градуси по скалата на
Фаренхайт (°F). Потърсете в Интернет подходяща формула, с която да извършите изчисленията. Закръглете резултата
до 2 знака след десетичната точка.

*/

import java.util.Scanner;
public class Pr1p271v1faster669 {
    public static double convertFahrenheitToCelsius(
            double TF) {
        double TC = (TF * 1.8 + 32);
        return TC;
    }

    public static void main(String[] args) {
        Scanner Scan_CTF = new Scanner(System.in);
        System.out.print("Enter temperature: ");

        double T = Scan_CTF.nextDouble();
        T = convertFahrenheitToCelsius(T);

        System.out.printf("Temperature is: %f.%n", T);

        if(T >= 37){
            System.out.print("Temperature is ill!");
        }
        Scan_CTF.close();
    }
}

/*
--- Var Legend

TF = Temperature Fahrenheite
TC = Temperature Celsius

T = Temperature

*/