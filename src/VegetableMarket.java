import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class VegetableMarket {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        double priceKgVeget=Double.parseDouble(reader.readLine());
        double priceKgFruits=Double.parseDouble(reader.readLine());
        int kgVege=Integer.parseInt(reader.readLine());
        int kgFruits=Integer.parseInt(reader.readLine());


        double priceAllvege=priceKgVeget*kgVege;
        double priceAllfr=priceKgFruits*kgFruits;
//        DecimalFormat df=new DecimalFormat("#.##");
        System.out.printf("%f",((priceAllfr+priceAllvege)/1.94));
    }
}
