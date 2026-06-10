package core_java_practice.core_java_practice.gcr_codebase.control_flow.Level1;

import java.util.Scanner;

// Creating class NaturalNumberSum
class NaturalNumberSum {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get user input
        int number = input.nextInt();

        // Check if number is natural
        if (number > 0) {

            // Compute sum
            int sumOfNaturalNumbers =
                    number * (number + 1) / 2;

            // Display result
            System.out.println("The sum of " + number +
                    " natural numbers is "
                    + sumOfNaturalNumbers);

        } else {

            // Display invalid message
            System.out.println("The number "
                    + number +
                    " is not a natural number");
        }

        // Close Scanner
        input.close();
    }
}
