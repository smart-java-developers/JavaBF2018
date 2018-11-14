package Tests;

public class TestsWithRecursionV2mirozspace {
    public static void main(String[] args) {
        testRecursin1(5);
    }

    private static int testRecursin1(int num) {
        if (num <= 0) {
            return 1;
        } else {
            return num * testRecursin1(num - 1);

        }
    }
}
