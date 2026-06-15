package core_java_practice.core_java_practice.gcr_codebase.methods_practice.Level2;

import java.util.Scanner;

public class UnitConverter3 {

    public static double convertFahrenheitToCelsius(
            double fahrenheit) {

        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(
            double celsius) {

        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(
            double pounds) {

        double poundsToKilogramsFactor = 0.453592;
        return pounds * poundsToKilogramsFactor;
    }

    public static double convertKilogramsToPounds(
            double kilograms) {

        double kilogramsToPoundsFactor = 2.20462;
        return kilograms * kilogramsToPoundsFactor;
    }

    public static double convertGallonsToLiters(
            double gallons) {

        double gallonsToLitersFactor = 3.78541;
        return gallons * gallonsToLitersFactor;
    }

    public static double convertLitersToGallons(
            double liters) {

        double litersToGallonsFactor = 0.264172;
        return liters * litersToGallonsFactor;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        System.out.print("Enter Celsius: ");
        double celsius = input.nextDouble();

        System.out.print("Enter Pounds: ");
        double pounds = input.nextDouble();

        System.out.print("Enter Kilograms: ");
        double kilograms = input.nextDouble();

        System.out.print("Enter Gallons: ");
        double gallons = input.nextDouble();

        System.out.print("Enter Liters: ");
        double liters = input.nextDouble();

        System.out.println("Fahrenheit to Celsius = " +
                convertFahrenheitToCelsius(fahrenheit));

        System.out.println("Celsius to Fahrenheit = " +
                convertCelsiusToFahrenheit(celsius));

        System.out.println("Pounds to Kilograms = " +
                convertPoundsToKilograms(pounds));

        System.out.println("Kilograms to Pounds = " +
                convertKilogramsToPounds(kilograms));

        System.out.println("Gallons to Liters = " +
                convertGallonsToLiters(gallons));

        System.out.println("Liters to Gallons = " +
                convertLitersToGallons(liters));

        input.close();
    }
}