package core_java_practice.core_java_practice.gcr_codebase.methods_practice.Level2;

import java.util.Scanner;

public class FactorsOfNumber {

    // Method to find factors and return them in an array
    public static int[] findFactors(int number) {

        int factorCount = 0;

        for (int index = 1; index <= number; index++) {
            if (number % index == 0) {
                factorCount++;
            }
        }

        int[] factors = new int[factorCount];
        int factorIndex = 0;

        for (int index = 1; index <= number; index++) {
            if (number % index == 0) {
                factors[factorIndex] = index;
                factorIndex++;
            }
        }

        return factors;
    }

    // Method to find sum of factors
    public static int findSumOfFactors(int[] factors) {

        int sum = 0;

        for (int index = 0; index < factors.length; index++) {
            sum += factors[index];
        }

        return sum;
    }

    // Method to find product of factors
    public static long findProductOfFactors(int[] factors) {

        long product = 1;

        for (int index = 0; index < factors.length; index++) {
            product *= factors[index];
        }

        return product;
    }

    // Method to find sum of squares of factors
    public static double findSumOfSquares(int[] factors) {

        double sumOfSquares = 0;

        for (int index = 0; index < factors.length; index++) {
            sumOfSquares += Math.pow(factors[index], 2);
        }

        return sumOfSquares;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = input.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int index = 0; index < factors.length; index++) {
            System.out.print(factors[index] + " ");
        }

        System.out.println("\nSum of Factors = " +
                findSumOfFactors(factors));

        System.out.println("Product of Factors = " +
                findProductOfFactors(factors));

        System.out.println("Sum of Squares of Factors = " +
                findSumOfSquares(factors));

        input.close();
    }
}
