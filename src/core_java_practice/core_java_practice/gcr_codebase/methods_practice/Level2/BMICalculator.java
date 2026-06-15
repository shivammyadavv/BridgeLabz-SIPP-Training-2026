package core_java_practice.core_java_practice.gcr_codebase.methods_practice.Level2;

import java.util.Scanner;

public class BMICalculator {

    public static double calculateBMI(
            double weight,
            double heightInCm) {

        double heightInMeters =
                heightInCm / 100.0;

        return weight /
                (heightInMeters * heightInMeters);
    }

    public static String getBMIStatus(
            double bmi) {

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfPersons = 10;

        double[][] personData =
                new double[numberOfPersons][3];

        String[] bmiStatus =
                new String[numberOfPersons];

        for (int index = 0;
             index < numberOfPersons;
             index++) {

            System.out.print(
                    "Enter Weight (kg) for Person "
                            + (index + 1) + ": ");

            personData[index][0] =
                    input.nextDouble();

            System.out.print(
                    "Enter Height (cm) for Person "
                            + (index + 1) + ": ");

            personData[index][1] =
                    input.nextDouble();

            personData[index][2] =
                    calculateBMI(
                            personData[index][0],
                            personData[index][1]);

            bmiStatus[index] =
                    getBMIStatus(
                            personData[index][2]);
        }

        System.out.println(
                "\nWeight\tHeight\tBMI\tStatus");

        for (int index = 0;
             index < numberOfPersons;
             index++) {

            System.out.printf(
                    "%.2f\t%.2f\t%.2f\t%s%n",
                    personData[index][0],
                    personData[index][1],
                    personData[index][2],
                    bmiStatus[index]);
        }

        input.close();
    }
}
