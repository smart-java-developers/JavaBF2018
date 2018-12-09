import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProjectPrizeEx1i2AlexKoleva {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int projectParts=Integer.parseInt(reader.readLine());
        int counterParts=0;
        double prizeTotal=0;
        double prizeForPoint=Double.parseDouble(reader.readLine());
        int sumpointsProject=0;
        for (int i = 0; i <projectParts ; i++) {

          int  pointsProject=Integer.parseInt(reader.readLine());

            counterParts++;
            if(counterParts%2==0){
                pointsProject*=2;
            }
            sumpointsProject+=pointsProject;
        }
        prizeTotal=prizeForPoint*sumpointsProject;
        System.out.printf("The project prize was %.2f lv.",prizeTotal);
    }
}
