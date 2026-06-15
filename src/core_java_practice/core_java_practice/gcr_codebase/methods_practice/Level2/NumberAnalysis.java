package core_java_practice.core_java_practice.gcr_codebase.methods_practice.Level2;

import java.util.Scanner;

public class NumberAnalysis {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compareNumbers(int number1, int number2) {

        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int arraySize = 5;
        int[] numbers = new int[arraySize];

        for (int index = 0; index < numbers.length; index++) {

            System.out.print(
                    "Enter Number " + (index + 1) + ": ");

            numbers[index] = input.nextInt();
        }

        System.out.println("\nNumber Analysis");

        for (int index = 0; index < numbers.length; index++) {

            int currentNumber = numbers[index];

            if (isPositive(currentNumber)) {

                if (isEven(currentNumber)) {
                    System.out.println(
                            currentNumber +
                                    " is Positive and Even");
                } else {
                    System.out.println(
                            currentNumber +
                                    " is Positive and Odd");
                }

            } else {

                System.out.println(
                        currentNumber +
                                " is Negative");
            }
        }

        int comparisonResult =
                compareNumbers(
                        numbers[0],
                        numbers[numbers.length - 1]);

        if (comparisonResult == 1) {
            System.out.println(
                    "First Element is Greater");
        } else if (comparisonResult == 0) {
            System.out.println(
                    "Both Elements are Equal");
        } else {
            System.out.println(
                    "Last Element is Greater");
        }

        input.close();
    }
}

