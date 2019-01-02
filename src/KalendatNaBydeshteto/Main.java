package KalendatNaBydeshteto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        String dayStr = scanner.nextLine();
    }
}

/*
Вход:
- ден
- месец
- година
- ден (понеделк - неделя) - Не знам дали е нужно на входа да въвеждаме това

- дни напред

Изход:
- във формат ->>>    Днес сме <примерно понеделник> - <ден>.<месец>.<година>

Да не се ползва календара на компютъра, а да се измисли алгоритъм за преместването на дните според годината!
 */