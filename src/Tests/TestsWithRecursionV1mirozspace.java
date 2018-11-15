package Tests;

//import java.util.Scanner;

//Един тест за това как работи рекурсията
public class TestsWithRecursionV1mirozspace {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Hello before recursion!");
        recursion(5);
        System.out.println("Hello after recursion!");

    }

    private static void recursion(int steps) {
        if (steps == 0) {
            return;
        }
        System.out.println("Calling recursion at step " + steps);
        recursion(steps - 1);
        //recursion(steps - 1);
        System.out.println("Exiting recursion call at step " + steps);
    }
}
