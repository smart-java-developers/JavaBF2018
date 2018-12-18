package Exam1December;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr4EverestAlexKoleva {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int counterDays=1;
        int metersClimbed=0;
        int counterMeters=5364;
        int metersEverest=8848;
        String endDay=reader.readLine();
        while (true){
            if(endDay.equals("END")){
                break;
            }else
            if(endDay.equals("Yes")){
                counterDays++;

            }

            if(counterDays>5) {
            break;
            }
//            if(counterMeters>=8848){
//                break;
//            }
            metersClimbed = Integer.parseInt(reader.readLine());
            counterMeters+=metersClimbed;

            if(counterMeters>=metersEverest){

                break;
            }
            endDay=reader.readLine();


        }
        if(counterMeters>=metersEverest) {
            System.out.printf("Goal reached for %d days!", counterDays);
        }else
       {
           System.out.printf("Failed!%n");
           System.out.printf("%d", counterMeters);
       }
//


    }
}
