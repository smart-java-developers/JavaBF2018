package Others1;
//mirozspace - след доста време занимавка, стана.
import java.util.Scanner;

public class DigitsV1mirozspace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numStr = scanner.nextLine();
        scanner.close();
        String result = cleanSymbol(numStr);
        long resultF = 0;
        long num;
        long num2;

        num = Long.parseLong(result);
        final long count = Long.toString(num).length();

        while (true) {
            for (int i = 0; i < count; i++) {
                num2 = num % 10;
                num = num / 10;
                resultF = resultF + num2;
            }
            if (resultF <= 9) {
                System.out.println(resultF);
                System.exit(0);
            }
            num = resultF;
            resultF = 0;
        }
    }

    private static String cleanSymbol(String input) {
        StringBuilder sb = new StringBuilder(input.length());

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c > 47 && c < 58) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
