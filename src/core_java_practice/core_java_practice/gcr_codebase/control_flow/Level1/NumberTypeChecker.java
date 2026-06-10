package core_java_practice.core_java_practice.gcr_codebase.control_flow.Level1;

import java.util.Scanner;

// Creating class NumberTypeChecker
class NumberTypeChecker {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get user input
        int number = input.nextInt();

        // Check number type
        if (number > 0) {

            System.out.println("Positive");

        } else if (number < 0) {

            System.out.println("Negative");

        } else {

            System.out.println("Zero");
        }

        // Close Scanner
        input.close();
    }
}
