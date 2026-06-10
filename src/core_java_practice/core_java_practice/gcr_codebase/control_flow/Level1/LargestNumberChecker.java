package core_java_practice.core_java_practice.gcr_codebase.control_flow.Level1;

 import java.util.Scanner;

// Creating class LargestNumberChecker
class LargestNumberChecker {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get three numbers
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Check largest number
        boolean isFirstLargest =
                (number1 > number2 && number1 > number3);

        boolean isSecondLargest =
                (number2 > number1 && number2 > number3);

        boolean isThirdLargest =
                (number3 > number1 && number3 > number2);

        // Display results
        System.out.println("Is the first number the largest? "
                + isFirstLargest);

        System.out.println("Is the second number the largest? "
                + isSecondLargest);

        System.out.println("Is the third number the largest? "
                + isThirdLargest);

        // Close Scanner
        input.close();
    }
}