// Метод за сортиране на масив от int или double (деклариран е с еднакво име, но различени арументи и изход)
// double[] numbers1 = new numbers[] { 3, 2.5, 1.5 };
// int[] numbers2 = new int[] { 3, 1, 2 };
// изпълнение> sortNumbers(numbers1); или sortNumbers(numbers2); или sortNumbers(1, 0, 5, 6, 4, 2, 3);

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
}
