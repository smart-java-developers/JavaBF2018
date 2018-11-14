// Сортиране на масиви, версия 1, Deianov
// 1. Зареждане на публични методи от друг клас.
// 2. Използват се два метода с еднакво име, но различни параметри - компилаторът избира кой да използва в зависимост от аргументите, които са му подадени.
// 3. При сортирането новата подредба се присвоява към масивът.
// 4. Освен масив, методите могат да сортират и произволен брой подадени им аргументи, като връщат сортиран масив.
// 5. метод който използва рекурсия


package Others1;

import static JavaBF.Java271.Pr1p278v1Deianov.sortNumbers;
import static JavaBF.Java271.Pr1p278v1Deianov.sortNumbersRecursion;

public class TestSortArrayVer1 {
    public static void main(String[] args) {
        int[] arrInteger = {4, 3, 1, 5, 2, 0};
        for (int i: sortNumbers(arrInteger)) {
            System.out.print(i + " ");
        }
        System.out.println();
        double[] arrDouble = {1.5, 3.5, 5.0, 0.0};
        for (double d: sortNumbers(arrDouble)) {
            System.out.print(d + " ");
        }
        System.out.println();
        for (int i: sortNumbers(1, 2, 5, 6, 7, 4, 8, 0, 3, 9, 10)) {
            System.out.print(i + " ");
        }
        int[] arrInteger2 = {12, 10, 11, 20, 13, 15, 14, 19, 18, 17, 16};
        // Сортиране на масив с метод, който използва рекурсия (recursion).
        System.out.println();
        for (int i: sortNumbersRecursion(arrInteger2)) {
            System.out.print(i + " ");
        }
    }
}
