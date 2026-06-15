package core_java_practice.core_java_practice.gcr_codebase.methods_practice.Level2;

import java.util.Scanner;

public class UnitConverter {

    public static double convertKmToMiles(double kilometers) {

        double kmToMilesFactor = 0.621371;

        return kilometers * kmToMilesFactor;
    }

    public static double convertMilesToKm(double miles) {

        double milesToKmFactor = 1.60934;

        return miles * milesToKmFactor;
    }

    public static double convertMetersToFeet(double meters) {

        double metersToFeetFactor = 3.28084;

        return meters * metersToFeetFactor;
    }

    public static double convertFeetToMeters(double feet) {

        double feetToMetersFactor = 0.3048;

        return feet * feetToMetersFactor;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Kilometers: ");
        double kilometers = input.nextDouble();

        System.out.print("Enter Miles: ");
        double miles = input.nextDouble();

        System.out.print("Enter Meters: ");
        double meters = input.nextDouble();

        System.out.print("Enter Feet: ");
        double feet = input.nextDouble();

        System.out.println("Kilometers to Miles = " +
                convertKmToMiles(kilometers));

        System.out.println("Miles to Kilometers = " +
                convertMilesToKm(miles));

        System.out.println("Meters to Feet = " +
                convertMetersToFeet(meters));

        System.out.println("Feet to Meters = " +
                convertFeetToMeters(feet));

        input.close();
    }
}
