package KalendatNaBydeshteto;

class AllDays {

    int dayFromLastMonths(int dayFLM, int dayPlus) {

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
        return dayPlus + dayFLM;
    }
}
