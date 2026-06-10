package core_java_practice.core_java_practice.gcr_codebase.control_flow.Level1;

import java.util.Scanner;

// Creating class DivisibleByFiveChecker
class DivisibleByFiveChecker {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get user input
        int number = input.nextInt();

        // Check divisibility by 5
        boolean isDivisible = (number % 5 == 0);

        // Display result
        System.out.println("Is the number " + number +
                " divisible by 5? " + isDivisible);

        // Close Scanner
        input.close();
    }
}