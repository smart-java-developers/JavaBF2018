package Others1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeTiles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nPl = Integer.parseInt(reader.readLine());
        double lengthTile = Double.parseDouble(reader.readLine());
        double widthTile = Double.parseDouble(reader.readLine());
        int lengthBench = Integer.parseInt(reader.readLine());
        int widthBench = Integer.parseInt(reader.readLine());


        int resultPl = nPl * nPl;
        double resultTile = lengthTile * widthTile;
        int bench = lengthBench * widthBench;
        double result = (resultPl - bench) / resultTile;
        double time = result * 0.2;
        System.out.printf("%f%n", result);
        System.out.println(time);

    }
}
