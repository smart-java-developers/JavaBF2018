package KalendatNaBydeshteto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        int dayPlus = Integer.parseInt(scanner.nextLine());

        int allDay = day + dayFromLastMonths(month)+dayPlus;
        System.out.println(allDay);//Vsichki dni (Plus dobavenite). :)

//        int allDay = allDay + day;
//        allDay = allDay + dayPlus;
//
//        if (allDay >= 0 && allDay <= 31) {
//            month = 1;
//            day = 31 - allDay;
//        } else if (allDay <= 59) {
//            month = 2;
//            allDay = allDay - 31;
//            day = 28 - allDay;
//        } else if (allDay <= 90) {
//            month = 3;
//            day = 90 - allDay;
//        }
//        System.out.println(day + "." + month);
    }

    private static int dayFromLastMonths(int dayFLM) {
        if (dayFLM == 1) {
            dayFLM = 0;
        } else if (dayFLM == 2) {
            dayFLM = 31;
        } else if (dayFLM == 3) {
            dayFLM = 59;
        } else if (dayFLM == 4) {
            dayFLM = 90;
        } else if (dayFLM == 5) {
            dayFLM = 120;
        } else if (dayFLM == 6) {
            dayFLM = 151;
        } else if (dayFLM == 7) {
            dayFLM = 181;
        } else if (dayFLM == 8) {
            dayFLM = 212;
        } else if (dayFLM == 9) {
            dayFLM = 243;
        } else if (dayFLM == 10) {
            dayFLM = 273;
        } else if (dayFLM == 11) {
            dayFLM = 304;
        } else if (dayFLM == 12) {
            dayFLM = 335;
        }
        return dayFLM;
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