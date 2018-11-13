package Others1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DailyEarnings {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int workingDays=Integer.parseInt(reader.readLine());
        double earnedMoneyDay=Double.parseDouble(reader.readLine());
        double exchangeRate=Double.parseDouble(reader.readLine());

        double moneyMonth=workingDays*earnedMoneyDay;
        double moneyYear=moneyMonth*12+moneyMonth*2.5;
        double tax=0.25*moneyYear;
        double realincomeLeva=(moneyYear-tax)*exchangeRate;
        double  averageIncomDay=realincomeLeva/365;

        System.out.printf("%.2f",averageIncomDay);

    }
}
