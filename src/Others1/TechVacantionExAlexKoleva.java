import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TechVacantionExAlexKoleva {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        int groupCount=Integer.parseInt(reader.readLine());
        String type=reader.readLine();
        String day=reader.readLine();
        double price=0;
        if(day.equals("Friday")){
            if(type.equals("Students")){
                price=8.45*groupCount;

            }else if(type.equals("Business")){
                price=10.9*groupCount;
            }else if(type.equals("Regular")){
                price=15*groupCount;
            }
        }else if(day.equals("Saturday")){
            if(type.equals("Students")){
                price=9.80*groupCount;
            }else if(type.equals("Business")){
                price=15.6*groupCount;
            }else if(type.equals("Regular")){
                price=20*groupCount;
            }
        }else {
            if(type.equals("Students")){
                price=10.46*groupCount;
            }else if(type.equals("Business")){
                price=16*groupCount;
            }else if(type.equals("Regular")){
                price=22.50*groupCount;
            }
        }
        if(type.equals("Students")&&groupCount>=30){
            price*=0.85;
        }else if(type.equals("Business")&&groupCount>=100){
            double pricePerPerson=price/groupCount;
            price-=pricePerPerson*10;
        }else if(groupCount>=10&&groupCount<=20&&type.equals("Regular")){

                price*=0.95;

        }

        System.out.println(String.format("Total price: %.2f", price));
    }
}
