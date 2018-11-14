// Сортиране на масиви, версия 1, Deianov
// 1. Използват се два метода с еднакво име, но различни параметри - компилаторът избира кой да използва в зависимост от аргументите, които са му подадени.
// 2. При сортирането новата подредба се присвоява към масивът.
// 3. Освен масив, методите могат да сортират и произволен брой подадени им аргументи, като връщат сортиран масив.
// 4. Метод който използва рекурсия

package JavaBF.Java271;

public class Pr1p278v1Deianov {

    public static int[] sortNumbers(int... numbers) {
        // The sorting logic:
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                // Swapping the values
                if (numbers[i] > numbers[j]) {
                    int tempVar = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tempVar;
                }
            }
        }
        return numbers;
    }

    public static double[] sortNumbers(double... numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    double tempVar = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tempVar;
                }
            }
        }
        return numbers;
    }

    public static int[] sortNumbersRecursion(int[] numbers) {
        boolean flag = false;
        int temp;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
                flag = true;
            }
        }
        if (flag) {
            sortNumbersRecursion(numbers);
        }
        return numbers;
    }
}
