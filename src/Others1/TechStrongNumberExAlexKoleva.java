import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TechStrongNumberExAlexKoleva {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String numberAsString=reader.readLine();
        int number=Integer.parseInt(numberAsString);
        int sum=0;
        for (int i = 0; i <numberAsString.length() ; i++) {
            int digit=numberAsString.charAt(i)-'0';

            int factorial=1;
            for (int j = 1; j <digit ; j++) {
                factorial*=j;
            }
            sum+=factorial;
        }


//second desition

//        int input=Integer.parseInt(reader.readLine());
//        int number=input;
//        int sum=0;
//        while (number>0) {
//            int digit = number % 10;
//             number/=10;
//             int factorial=1;
//            for (int i = 1; i <=digit ; i++) {
//                factorial*=i;
//            }
//            sum+=factorial;
//        }
//        if(sum==input){
//            System.out.println("yes");
//        }else {
//            System.out.println("no");
//        }
        if (sum==number){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
