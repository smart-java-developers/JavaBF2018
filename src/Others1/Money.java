package Others1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Money {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int bitcoin=Integer.parseInt(reader.readLine());
        double uan=Double.parseDouble(reader.readLine());
        double commision=Double.parseDouble(reader.readLine());

       double bitcLeva=bitcoin*1168;
       double uanDollar=uan*0.15;
       double uanLeva=uanDollar*1.76;
       double leva=bitcLeva+uanLeva;
       double euro=leva/1.95;
       double resultComm=commision*euro/100;
       euro=euro-resultComm;
        System.out.println(euro);
    }
}
