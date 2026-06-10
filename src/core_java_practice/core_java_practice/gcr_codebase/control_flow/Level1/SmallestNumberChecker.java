package core_java_practice.core_java_practice.gcr_codebase.control_flow.Level1;

import java.util.Scanner;

// Creating class SmallestNumberChecker
class SmallestNumberChecker {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get three numbers
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Check if first number is smallest
        boolean isFirstSmallest =
                (number1 < number2 && number1 < number3);

        // Display result
        System.out.println("Is the first number the smallest? "
                + isFirstSmallest);

        // Close Scanner
        input.close();
    }
}