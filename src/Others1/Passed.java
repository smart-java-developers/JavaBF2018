

import java.text.DecimalFormat;
import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double grade=Double.parseDouble(scanner.nextLine());
        if(grade>=3.00){
            System.out.println("Passed!");
        }else {
            System.out.println("Failed!");
        }


//        DecimalFormat format=new DecimalFormat("#.#####");
//        double x=3.45676447;
////        format dava String
//        String formatedNumber=format.format(x);
//        System.out.printf("%s", formatedNumber);
    }
}
