import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TechVendingMashineExAlexKoleva {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String input="";
        double sum=0;
        double price=0;

        while (true) {
            input = reader.readLine();

            if (input.equals("Start")) {
                break;
            }
            double money = Double.parseDouble(input);
            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1.0 || money == 2.0) {
                sum += money;
            } else {
                System.out.printf("Cannot accept %.2f%n", money);
            }
        }

            String command=reader.readLine();
            boolean yesProduct=false;

        while (!command.equals("End")) {


                switch (command){
                    case "Nuts":
                        price=2.0;

                        yesProduct=true;
                        break;
                    case "Water":
                        price=0.7;

                        yesProduct=true;
                        break;
                    case "Crisps":
                        price=1.5;

                        yesProduct=true;
                        break;
                    case "Soda":
                        price=0.8;

                        yesProduct=true;
                        break;
                    case "Coke":
                        price=1.0;

                        yesProduct=true;
                        break;
                        default:
                            System.out.println("Invalid product");
                            break;

                }


                if(input.equals("End")){
                    break;
                }

                if(sum>=price&&yesProduct&&sum>0&&price>0) {
                    System.out.printf("Purchased %s%n", command);
                    sum -= price;

                price=0;
                }else  if(price>0){
                    System.out.printf("Sorry, not enough money%n");
                    price=0;

                }

            command=reader.readLine();


        }

            System.out.printf("Change: %.2f",sum);

    }
}
