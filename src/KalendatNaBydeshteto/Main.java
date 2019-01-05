package KalendatNaBydeshteto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        int dayPlus = Integer.parseInt(scanner.nextLine());
        final int nowYears = 2019;

        AllDays allDays = new AllDays();
        int allDays2 = day + allDays.dayFromLastMonths(month,dayPlus);
        System.out.println(allDays2);
    }

}

/*
Здравейте!
Идеята на задачата е следната:
Да се напише програма която приема като вход дадена дата на един ред -> примерно 03.01.2019, след това на следващ ред
с думи се пише деня от седмицата (понеделни...неделя). На следващ ред въвеждаме прозиволни дни които искаме да добавим към
тази дата (примерно 12834). На изхода трябва на един ред да ни се отпечата следното - <дата>.<месец>.<година> - <ден от седмицата> .
ДА НЕ СЕ ПОЛЗВАТ ФУНКЦИИТЕ ЗА ВЗЕМАНЕ НА ДАТА ОТ КОМПЮТЪРА. НИЕ ТРЯБВА ДА ИЗМИСЛИМ ЗАКОНОМЕРНОСТИТЕ за промяна на дните в годините
напред. :)
Всеки да работи в този файл, ако прецени да създава класове и да описва в коментар идеята му и какво е правил.
Поздрави!


 */