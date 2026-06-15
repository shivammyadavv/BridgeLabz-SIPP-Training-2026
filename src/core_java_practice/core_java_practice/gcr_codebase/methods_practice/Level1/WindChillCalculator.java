package core_java_practice.core_java_practice.gcr_codebase.methods_practice.Level1;

import java.util.Scanner;

public class WindChillCalculator {

    public static double calculateWindChill(
            double temperature,
            double windSpeed) {

        double windChill =
                35.74 +
                        (0.6215 * temperature)
                        - (35.75 * Math.pow(windSpeed, 0.16))
                        + (0.4275 * temperature *
                        Math.pow(windSpeed, 0.16));

        return windChill;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Temperature: ");
        double temperature = input.nextDouble();

        System.out.print("Enter Wind Speed: ");
        double windSpeed = input.nextDouble();

        double windChill =
                calculateWindChill(
                        temperature,
                        windSpeed);

        System.out.println(
                "Wind Chill Temperature = " + windChill);

        input.close();
    }
}
