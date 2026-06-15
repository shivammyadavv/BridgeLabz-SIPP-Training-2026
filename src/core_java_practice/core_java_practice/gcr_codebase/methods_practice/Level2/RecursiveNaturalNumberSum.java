package core_java_practice.core_java_practice.gcr_codebase.methods_practice.Level2;

import java.util.Scanner;

public class RecursiveNaturalNumberSum {

    public static int findSumUsingRecursion(int number) {

        if (number == 1) {
            return 1;
        }

        return number + findSumUsingRecursion(number - 1);
    }

    public static int findSumUsingFormula(int number) {

        return (number * (number + 1)) / 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Natural Number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid Natural Number");
            return;
        }

        int recursiveSum =
                findSumUsingRecursion(number);

        int formulaSum =
                findSumUsingFormula(number);

        System.out.println("Sum using Recursion = " +
                recursiveSum);

        System.out.println("Sum using Formula = " +
                formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Both Results are Correct");
        } else {
            System.out.println("Results are Different");
        }

        input.close();
    }
}
