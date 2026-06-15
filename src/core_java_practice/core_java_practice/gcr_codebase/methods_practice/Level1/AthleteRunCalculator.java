package core_java_practice.core_java_practice.gcr_codebase.methods_practice.Level1;

import java.util.Scanner;

public class AthleteRunCalculator {

    public static double calculateRounds(double side1, double side2, double side3) {

        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000.0;

        double rounds = totalDistance / perimeter;

        return rounds;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Side 1: ");
        double side1 = input.nextDouble();

        System.out.print("Enter Side 2: ");
        double side2 = input.nextDouble();

        System.out.print("Enter Side 3: ");
        double side3 = input.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);

        System.out.println("Number of Rounds Required = " + rounds);

        input.close();
    }
}
