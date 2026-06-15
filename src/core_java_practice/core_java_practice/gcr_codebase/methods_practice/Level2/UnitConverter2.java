package core_java_practice.core_java_practice.gcr_codebase.methods_practice.Level2;

import java.util.Scanner;

public class UnitConverter2 {

    public static double convertYardsToFeet(double yards) {
        double yardsToFeetFactor = 3.0;
        return yards * yardsToFeetFactor;
    }

    public static double convertFeetToYards(double feet) {
        double feetToYardsFactor = 0.333333;
        return feet * feetToYardsFactor;
    }

    public static double convertMetersToInches(double meters) {
        double metersToInchesFactor = 39.3701;
        return meters * metersToInchesFactor;
    }

    public static double convertInchesToMeters(double inches) {
        double inchesToMetersFactor = 0.0254;
        return inches * inchesToMetersFactor;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inchesToCentimetersFactor = 2.54;
        return inches * inchesToCentimetersFactor;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Yards: ");
        double yards = input.nextDouble();

        System.out.print("Enter Feet: ");
        double feet = input.nextDouble();

        System.out.print("Enter Meters: ");
        double meters = input.nextDouble();

        System.out.print("Enter Inches: ");
        double inches = input.nextDouble();

        System.out.println("Yards to Feet = " +
                convertYardsToFeet(yards));

        System.out.println("Feet to Yards = " +
                convertFeetToYards(feet));

        System.out.println("Meters to Inches = " +
                convertMetersToInches(meters));

        System.out.println("Inches to Meters = " +
                convertInchesToMeters(inches));

        System.out.println("Inches to Centimeters = " +
                convertInchesToCentimeters(inches));

        input.close();
    }
}
