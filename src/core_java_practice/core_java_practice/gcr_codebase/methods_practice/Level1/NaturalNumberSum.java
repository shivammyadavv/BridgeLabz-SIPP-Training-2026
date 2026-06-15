package core_java_practice.core_java_practice.gcr_codebase.methods_practice.Level1;

import java.util.Scanner;

public class NaturalNumberSum {

    public static int findSumOfNaturalNumbers(int number) {

        int sum = 0;

        for (int index = 1; index <= number; index++) {
            sum += index;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int number = input.nextInt();

        int sum = findSumOfNaturalNumbers(number);

        System.out.println("Sum = " + sum);

        input.close();
    }
}
