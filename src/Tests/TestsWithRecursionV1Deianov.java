package Tests;

public class TestsWithRecursionV1Deianov {
    public static void main(String[] args) {
        testRecursion1(0, 10);
    }
    private static void testRecursion1 (int startNum, int endNum) {
        if (startNum < endNum) {
            System.out.println(startNum);
            testRecursion1(startNum + 1, endNum);
        } else {
            System.out.println(endNum);
        }
    }
}
