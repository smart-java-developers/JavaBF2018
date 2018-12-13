import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TechPrintandSumExAlexKoleva {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int firstNum=Integer.parseInt(reader.readLine());
        int endNum=Integer.parseInt(reader.readLine());
        int sum=0;
        for (int i = firstNum; i <=endNum ; i++) {
            sum+=i;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Sum: "+ sum);
    }
}
