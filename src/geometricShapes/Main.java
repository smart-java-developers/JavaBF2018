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
                printInformationChoiceShape();
                formulaForFigure = scanner.nextLine();
                if (formulaForFigure.equalsIgnoreCase("Area")) {
                    // da se dopishe
                } else if (formulaForFigure.equalsIgnoreCase("Perimeter")) {
                    // da se dopishe
                }
            } else if (shape.equalsIgnoreCase("Ellipse")) {
                printInformationChoiceShape();
                formulaForFigure = scanner.nextLine();
                if (formulaForFigure.equalsIgnoreCase("Area")) {
                    // da se dopishe
                } else if (formulaForFigure.equalsIgnoreCase("Perimeter")) {
                    // da se dopishe
                }
            } else if (shape.equalsIgnoreCase("Hexagon")) {
                printInformationChoiceShape();
                formulaForFigure = scanner.nextLine();
                if (formulaForFigure.equalsIgnoreCase("Area")) {
                    // da se dopishe
                } else if (formulaForFigure.equalsIgnoreCase("Perimeter")) {
                    // da se dopishe
                }
            } else if (shape.equalsIgnoreCase("Pentagon")) {
                printInformationChoiceShape();
                formulaForFigure = scanner.nextLine();
                if (formulaForFigure.equalsIgnoreCase("Area")) {
                    // da se dopishe
                } else if (formulaForFigure.equalsIgnoreCase("Perimeter")) {
                    // da se dopishe
                }
            } else if (shape.equalsIgnoreCase("Rectangle")) {
                printInformationChoiceShape();
                formulaForFigure = scanner.nextLine();
                if (formulaForFigure.equalsIgnoreCase("Area")) {
                    // da se dopishe
                } else if (formulaForFigure.equalsIgnoreCase("Perimeter")) {
                    // da se dopishe
                }
            } else if (shape.equalsIgnoreCase("Trapez")) {
                printInformationChoiceShape();
                formulaForFigure = scanner.nextLine();
                if (formulaForFigure.equalsIgnoreCase("Area")) {
                    // da se dopishe
                } else if (formulaForFigure.equalsIgnoreCase("Perimeter")) {
                    // da se dopishe
                }
            } else if (shape.equalsIgnoreCase("Triangle")) {
                printInformationChoiceShape();
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
    private static void printInformationChoiceShape() {
        System.out.println("What do you want to calculate?");
        System.out.println("Area or Perimeter?");
        System.out.print("Enter your choice (code of shape): ");
    }
}
