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
                if (formulaForFigure.equalsIgnoreCase("Area")) {
                    // da se dopishe
                } else if (formulaForFigure.equalsIgnoreCase("Perimeter")) {
                    // da se dopishe
                }
                //end of code === mirozspace
            } else if (shape.equalsIgnoreCase("Trapez")) {

                formulaForFigure = scanner.nextLine();
                if (formulaForFigure.equalsIgnoreCase("Area")) {
                    // da se dopishe
                } else if (formulaForFigure.equalsIgnoreCase("Perimeter")) {
                    // da se dopishe
                }
            } else if (shape.equalsIgnoreCase("Triangle")) {

                formulaForFigure = scanner.nextLine();
                if (formulaForFigure.equalsIgnoreCase("Area")) {
                    // da se dopishe
                } else if (formulaForFigure.equalsIgnoreCase("Perimeter")) {
                    // da se dopishe
                }
            }

            System.out.print("Intput Yes ot No to decide for ne calculate: ");
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
