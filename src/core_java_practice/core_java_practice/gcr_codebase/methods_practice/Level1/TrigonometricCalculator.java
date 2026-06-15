package core_java_practice.core_java_practice.gcr_codebase.methods_practice.Level1;

import java.util.Scanner;

public class TrigonometricCalculator {

    public static double[] calculateTrigonometricFunctions(
            double angleInDegrees) {

        double angleInRadians =
                Math.toRadians(angleInDegrees);

        double sineValue =
                Math.sin(angleInRadians);

        double cosineValue =
                Math.cos(angleInRadians);

        double tangentValue =
                Math.tan(angleInRadians);

        return new double[]{
                sineValue,
                cosineValue,
                tangentValue
        };
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Angle in Degrees: ");
        double angleInDegrees = input.nextDouble();

        double[] trigonometricValues =
                calculateTrigonometricFunctions(
                        angleInDegrees);

        System.out.println("Sine = " +
                trigonometricValues[0]);

        System.out.println("Cosine = " +
                trigonometricValues[1]);

        System.out.println("Tangent = " +
                trigonometricValues[2]);

        input.close();
    }
}
