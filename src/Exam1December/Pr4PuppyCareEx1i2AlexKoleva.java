package Exam1December;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr4PuppyCareEx1i2AlexKoleva {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        int foodPuppy=Integer.parseInt(reader.readLine())*1000;
        String command=reader.readLine();
        int restFood=0;

        while (!command.equals("Adopted")){
           int meals=Integer.parseInt(command);

           restFood+=meals;

           command=reader.readLine();
        }
        int rest=foodPuppy-restFood;
        if(rest>=0){
            System.out.printf("Food is enough! Leftovers: %d grams.", rest);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(rest));
        }
    }
}
