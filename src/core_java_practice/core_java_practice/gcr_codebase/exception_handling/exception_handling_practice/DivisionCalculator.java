package core_java_practice.core_java_practice.gcr_codebase.exception_handling.exception_handling_practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter First Number: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Enter Second Number: ");
            int secondNumber = scanner.nextInt();

            int result =
                    firstNumber / secondNumber;

            System.out.println(
                    "Result = " + result);

        } catch (ArithmeticException exception) {

            System.out.println(
                    "Cannot divide by zero");

        } catch (InputMismatchException exception) {

            System.out.println(
                    "Please enter numeric values only");
        }

        scanner.close();
    }
}
