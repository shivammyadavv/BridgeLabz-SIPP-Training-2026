package core_java_practice.core_java_practice.gcr_codebase.methods_practice.Level1;

import java.util.Scanner;

public class QuotientRemainderCalculator {

    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = input.nextInt();

        System.out.print("Enter Divisor: ");
        int divisor = input.nextInt();

        int[] result = findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient = " + result[0]);
        System.out.println("Remainder = " + result[1]);

        input.close();
    }
}
