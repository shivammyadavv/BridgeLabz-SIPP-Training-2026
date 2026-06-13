package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level3;

import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status
    public static String[][] calculateBMIReport(double[][] personData) {

        String[][] bmiReport = new String[personData.length][4];

        for (int index = 0; index < personData.length; index++) {

            double weight = personData[index][0];
            double heightCm = personData[index][1];

            double heightMeter = heightCm / 100.0;

            double bmi = weight / (heightMeter * heightMeter);

            String status;

            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            bmiReport[index][0] = String.valueOf(heightCm);
            bmiReport[index][1] = String.valueOf(weight);
            bmiReport[index][2] =
                    String.valueOf(Math.round(bmi * 100.0) / 100.0);
            bmiReport[index][3] = status;
        }

        return bmiReport;
    }

    // Display Report
    public static void displayReport(String[][] report) {

        System.out.println("\nHeight\tWeight\tBMI\tStatus");

        for (int index = 0; index < report.length; index++) {

            System.out.println(
                    report[index][0] + "\t" +
                            report[index][1] + "\t" +
                            report[index][2] + "\t" +
                            report[index][3]);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalPersons = 10;

        double[][] personData =
                new double[totalPersons][2];

        for (int index = 0; index < totalPersons; index++) {

            System.out.println(
                    "\nEnter Details For Person "
                            + (index + 1));

            System.out.print("Weight (kg): ");
            personData[index][0] = scanner.nextDouble();

            System.out.print("Height (cm): ");
            personData[index][1] = scanner.nextDouble();
        }

        String[][] report =
                calculateBMIReport(personData);

        displayReport(report);
    }
}
