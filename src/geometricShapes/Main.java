package geometricShapes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double sideAA, sideBB;
        String shape, code, formulaForFigure, command;
        command = "";

        while (true) {
            System.out.print("Select a shape: ");
            shape = scanner.nextLine();

            if (shape.equalsIgnoreCase("Circle")) {

                formulaForFigure = scanner.nextLine();
                if (formulaForFigure.equalsIgnoreCase("Area")) {
                    // da se dopishe
                } else if (formulaForFigure.equalsIgnoreCase("Perimeter")) {
                    // da se dopishe
                }
            } else if (shape.equalsIgnoreCase("Ellipse")) {

                formulaForFigure = scanner.nextLine();
                if (formulaForFigure.equalsIgnoreCase("Area")) {
                    // da se dopishe
                } else if (formulaForFigure.equalsIgnoreCase("Perimeter")) {
                    // da se dopishe
                }
            } else if (shape.equalsIgnoreCase("Hexagon")) {

                formulaForFigure = scanner.nextLine();
                if (formulaForFigure.equalsIgnoreCase("Area")) {
                    // da se dopishe
                } else if (formulaForFigure.equalsIgnoreCase("Perimeter")) {
                    // da se dopishe
                }
            } else if (shape.equalsIgnoreCase("Pentagon")) {

                formulaForFigure = scanner.nextLine();
                if (formulaForFigure.equalsIgnoreCase("Area")) {
                    // da se dopishe
                } else if (formulaForFigure.equalsIgnoreCase("Perimeter")) {
                    // da se dopishe
                }
                //Rectangle se pravi ot mirozspace
            } else if (shape.equalsIgnoreCase("Rectangle")) {
                System.out.print("What are you going to calculate (Input Area or Perimeter)? : ");
                formulaForFigure = scanner.nextLine();
                System.out.println("RECTANGLE");
                if (formulaForFigure.equalsIgnoreCase("Area")) {
                    System.out.print("Input side A: ");
                    sideAA = Double.parseDouble(scanner.nextLine());
                    System.out.print("Input side B: ");
                    sideBB = Double.parseDouble(scanner.nextLine());
                    System.out.println(sideAA * sideBB);
                } else if (formulaForFigure.equalsIgnoreCase("Perimeter")) {
                    System.out.print("Input side A: ");
                    sideAA = Double.parseDouble(scanner.nextLine());
                    System.out.print("Input side B: ");
                    sideBB = Double.parseDouble(scanner.nextLine());
                    System.out.println(2 * (sideAA * sideBB));
                } else {
                    System.out.println("Error!");
                }
                System.out.println("Do you want to see formulas for Area or Perimeter");
                String yesNo = scanner.nextLine();
                if (yesNo.equalsIgnoreCase("Yes")) {
                    System.out.printf("Area - > area = a * b%nPerimeter -> perimeter = 2 * (a + b)%n");
                }
                //end of code === mirozspace

                // Trapezoid by D.Pavlova

            } else if (shape.equalsIgnoreCase("Trapezoid")) {
                System.out.print("What would you like to calculate - please type Area or Perimeter: ");
                formulaForFigure = scanner.nextLine();
                System.out.println("TRAPEZOID");
                if (formulaForFigure.equalsIgnoreCase("Area")) {
                    System.out.print("Input side A: ");
                    sideAA = Double.parseDouble(scanner.nextLine());
                    System.out.print("Input side B: ");
                    sideBB = Double.parseDouble(scanner.nextLine());
                    System.out.print("Input side H: ");
                    double h = Double.parseDouble(scanner.nextLine());
                    System.out.println("Calculation is made by the following formula: " + "(A+B)" + "*H" + "/2");
                    System.out.println("Result: " + ((sideAA + sideBB) * h / 2));
                } else if (formulaForFigure.equalsIgnoreCase("Perimeter")) {
                    System.out.print("Input side A: ");
                    sideAA = Double.parseDouble(scanner.nextLine());
                    System.out.print("Input side B: ");
                    sideBB = Double.parseDouble(scanner.nextLine());
                    System.out.print("Input side C: ");
                    double sideC = Double.parseDouble(scanner.nextLine());
                    System.out.print("Input side D: ");
                    double sideD = Double.parseDouble(scanner.nextLine());
                    System.out.println("Calculation is made by the following formula: " + "A+B+C+D");
                    System.out.println("Result: " + (sideAA + sideBB + sideC + sideD));
                } else {
                    System.out.println("Error!");
                }

                // End of code by D.Pavlova

            } else if (shape.equalsIgnoreCase("Triangle")) {

                formulaForFigure = scanner.nextLine();
                if (formulaForFigure.equalsIgnoreCase("Area")) {
                    // da se dopishe
                } else if (formulaForFigure.equalsIgnoreCase("Perimeter")) {
                    // da se dopishe
                }
            }

            System.out.print("Input Yes or No to decide for new calculation: ");
            command = scanner.nextLine();
            if (command.equalsIgnoreCase("No")) {
                break;
            } else if (!(command.equalsIgnoreCase("Yes"))) {
                break;
            }
        }
        System.out.println("Good Bye!");
    }
}
