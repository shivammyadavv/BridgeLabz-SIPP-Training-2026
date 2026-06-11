package core_java_practice.core_java_practice.gcr_codebase.arrays_practice.Level1;

import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        // Input
        for (int index = 0; index < numbers.length; index++) {
            System.out.print("Enter number " + (index + 1) + ": ");
            numbers[index] = input.nextInt();
        }

        // Classification
        for (int number : numbers) {

            if (number > 0) {

                if (number % 2 == 0) {
                    System.out.println(number + " is Positive Even");
                } else {
                    System.out.println(number + " is Positive Odd");
                }

            } else if (number < 0) {
                System.out.println(number + " is Negative");
            } else {
                System.out.println(number + " is Zero");
            }
        }

        // Compare first and last element
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and Last elements are Equal");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is Greater");
        } else {
            System.out.println("Last element is Greater");
        }

        input.close();
    }
}
