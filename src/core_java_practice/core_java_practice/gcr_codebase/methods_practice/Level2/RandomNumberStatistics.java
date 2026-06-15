package core_java_practice.core_java_practice.gcr_codebase.methods_practice.Level2;

import java.util.Arrays;

public class RandomNumberStatistics {

    public static int[] generate4DigitRandomArray(
            int size) {

        int[] randomNumbers =
                new int[size];

        int minimumNumber = 1000;
        int range = 9000;

        for (int index = 0;
             index < randomNumbers.length;
             index++) {

            randomNumbers[index] =
                    (int)(Math.random()
                            * range)
                            + minimumNumber;
        }

        return randomNumbers;
    }

    public static double[] findAverageMinMax(
            int[] numbers) {

        int sum = 0;

        int minimumValue =
                numbers[0];

        int maximumValue =
                numbers[0];

        for (int index = 0;
             index < numbers.length;
             index++) {

            sum += numbers[index];

            minimumValue =
                    Math.min(
                            minimumValue,
                            numbers[index]);

            maximumValue =
                    Math.max(
                            maximumValue,
                            numbers[index]);
        }

        double average =
                (double) sum /
                        numbers.length;

        return new double[]{
                average,
                minimumValue,
                maximumValue
        };
    }

    public static void main(String[] args) {

        int arraySize = 5;

        int[] randomNumbers =
                generate4DigitRandomArray(
                        arraySize);

        System.out.println(
                "Random Numbers = "
                        + Arrays.toString(
                        randomNumbers));

        double[] statistics =
                findAverageMinMax(
                        randomNumbers);

        System.out.println(
                "Average = "
                        + statistics[0]);

        System.out.println(
                "Minimum = "
                        + (int)statistics[1]);

        System.out.println(
                "Maximum = "
                        + (int)statistics[2]);
    }
}
