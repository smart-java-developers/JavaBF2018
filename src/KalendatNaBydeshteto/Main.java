package KalendatNaBydeshteto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        //int year = Integer.parseInt(scanner.nextLine());
        //String dayStr = scanner.nextLine();
        int dayPlus = Integer.parseInt(scanner.nextLine());
        //String
        //===mirozspace
        //За сега идеята ми е ако въведем примерно 20.02 - да изчислим всички дни от тази дата и да добавим новите.
        //Тоест при месец 2 имаме 31 дена от Януари + тези от датата - тоест 51 дена.
        //На подобен принцип превръщаме обратно дните в месец и дни
        //За сега е това, като идея, но нещо не работи точно и го мисля в момента.
        int allDay = 0;

        if (month == 1) {
            allDay = 0;
        } else if (month == 2) {
            allDay = 31;
        } else if (month == 3) {
            allDay = 59;
        } else if (month == 4) {
            allDay = 90;
        } else if (month == 5) {
            allDay = 120;
        } else if (month == 6) {
            allDay = 151;
        } else if (month == 7) {
            allDay = 181;
        } else if (month == 8) {
            allDay = 212;
        } else if (month == 9) {
            allDay = 243;
        } else if (month == 10) {
            allDay = 273;
        } else if (month == 11) {
            allDay = 304;
        } else if (month == 12) {
            allDay = 335;
        }
        allDay = allDay + day;
        allDay = allDay + dayPlus;

        if (allDay >= 0 && allDay <= 31) {
            month = 1;
            day = 31 - allDay;
        } else if (allDay <= 59) {
            month = 2;
            allDay = allDay - 31;
            day = 28 - allDay;
        } else if (allDay <= 90) {
            month = 3;
            day = 90 - allDay;
        }
        System.out.println(day + "." + month);
        //===
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