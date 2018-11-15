package Tests;

public class TestsWithRecursionV1Deianov {

    public static void main(String[] args) {
        // принтиране от номер до номер, чрез рекурсия
        testRecursion1(0, 10);
    }

    private static void testRecursion1 (int startNum, int endNum) {
        if (startNum < endNum) {
            System.out.print(startNum + " ");
            testRecursion1(startNum + 1, endNum);
        } else {
            System.out.println(endNum);
        }
    }

}
