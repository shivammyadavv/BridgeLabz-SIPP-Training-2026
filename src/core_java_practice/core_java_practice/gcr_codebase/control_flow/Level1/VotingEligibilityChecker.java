package core_java_practice.core_java_practice.gcr_codebase.control_flow.Level1;

import java.util.Scanner;

// Creating class VotingEligibilityChecker
class VotingEligibilityChecker {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get age
        int age = input.nextInt();

        // Check eligibility
        if (age >= 18) {

            System.out.println("The person's age is "
                    + age +
                    " and can vote.");

        } else {

            System.out.println("The person's age is "
                    + age +
                    " and cannot vote.");
        }

        // Close Scanner
        input.close();
    }
}