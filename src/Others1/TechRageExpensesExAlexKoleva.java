import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TechRageExpensesExAlexKoleva {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int games=Integer.parseInt(reader.readLine());
        double headSet=Double.parseDouble(reader.readLine());
        double mousePrice=Double.parseDouble(reader.readLine());
        double keyboardPrice=Double.parseDouble(reader.readLine());
        double displayPrice=Double.parseDouble(reader.readLine());
        int headCount=games/2;
        int mouseCount=games/3;
        int keybCount=games/6;
        int disCount=games/12;

        double cost=headCount*headSet+mouseCount*mousePrice+keybCount*keyboardPrice+disCount*displayPrice;

        System.out.printf("Rage expenses: %.2f lv.",cost);



    }
}
