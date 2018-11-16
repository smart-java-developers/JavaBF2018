import java.util.Scanner;

public class MultyplicationTable2 {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int number=Integer.parseInt(scanner.nextLine());
            int times=Integer.parseInt(scanner.nextLine());
//            while (times<=10){
            for (int i = times; i <=10 ; i++) {

                    System.out.printf("%d X %d = %d%n", number, i, number * i);
                }

if(times>10) {
        System.out.printf("%d X %d = %d%n", number, times, number * times);

    }
            }
        }



