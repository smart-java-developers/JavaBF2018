package ExamTest;

import java.util.Scanner;

public class Pr4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shirochna = Integer.parseInt(scanner.nextLine());
        int dyljina = Integer.parseInt(scanner.nextLine());
        int visochina = Integer.parseInt(scanner.nextLine());
        String kashoniStr = "";
        int kashoni = 0;
        int sumKashoni = 0;

        int freeSpace = shirochna * dyljina * visochina;
        while (sumKashoni <= freeSpace && !(kashoniStr.equals("Done"))) {
            kashoniStr = scanner.nextLine();
            if (!(kashoniStr.equals("Done"))) {
                kashoni = Integer.parseInt(kashoniStr);
            }
            if (!(kashoniStr.equals("Done"))) {
                sumKashoni = sumKashoni + kashoni;
            }
        }

        if (freeSpace < sumKashoni) {
            int moreKashoni = freeSpace - sumKashoni;
            moreKashoni = Math.abs(moreKashoni);
            System.out.printf("No more free space! You need %d Cubic meters more.", moreKashoni);
        }

        if (kashoniStr.equals("Done") && freeSpace >= sumKashoni) {
            System.out.printf("%d Cubic meters left.", (freeSpace - sumKashoni));
        }
    }
}