import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreckingManiaEx1i2AlexKoleva {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countGroups = Integer.parseInt(reader.readLine());
        double totalPeople = 0;
        double countMusalaP = 0.0;
        double countMonblanP = 0.0;
        double countKilimandjaroP = 0.0;
        double countK2P = 0.0;
        double countEverestP = 0.0;
        for (int i = 0; i < countGroups; i++) {
            double numberPeople = Double.parseDouble(reader.readLine());
            totalPeople += numberPeople;
            if (numberPeople <= 5) {

                countMusalaP += numberPeople;
            } else if (numberPeople >= 6 && numberPeople <= 12) {

                countMonblanP += numberPeople;
            } else if (numberPeople >=13 && numberPeople <= 25) {

                countKilimandjaroP += numberPeople;
            } else if (numberPeople >= 26 && numberPeople <= 40) {

                countK2P += numberPeople;
            } else if(numberPeople>=41){
                countEverestP += numberPeople;
            }

        }
//        System.out.println(countK2P);
//        System.out.println(countKilimandjaroP);
        double persentMusala = (countMusalaP / totalPeople) * 100;
        double persentMonblan = countMonblanP / totalPeople * 100;
        double persentKilimandjaro = (countKilimandjaroP / totalPeople) * 100;
        double persentK2 = (countK2P / totalPeople) * 100;
        double persentEverest = (countEverestP / totalPeople) * 100;
        System.out.printf("%.2f%%%n",persentMusala);
        System.out.printf("%.2f%%%n",persentMonblan);
        System.out.printf("%.2f%%%n",persentKilimandjaro);
        System.out.printf("%.2f%%%n",persentK2);
        System.out.printf("%.2f%%%n",persentEverest);

    }
}
