import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TechPadawanEquipmentExAlexKoleva {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        double budget=Double.parseDouble(reader.readLine());
        int students=Integer.parseInt(reader.readLine());
        double lightseberPr=Double.parseDouble(reader.readLine());
        double robesPrice=Double.parseDouble(reader.readLine());
        double beltsPrice=Double.parseDouble(reader.readLine());

        double sebersTotal=Math.ceil(students*1.1)*lightseberPr;
        robesPrice*=students;
        beltsPrice*=(students-students/6);
        double totalCost=sebersTotal+robesPrice+beltsPrice;
        if(budget>=totalCost){
            System.out.println(String.format("The money is enough - it would cost %.2flv.",totalCost));
        }else {
            System.out.printf("Ivan Cho will need %.2flv more.", totalCost-budget);
        }
    }
}
