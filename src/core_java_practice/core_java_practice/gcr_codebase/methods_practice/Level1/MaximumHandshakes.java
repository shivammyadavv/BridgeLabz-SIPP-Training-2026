package core_java_practice.core_java_practice.gcr_codebase.methods_practice.Level1;

import java.util.Scanner;

public class MaximumHandshakes {

    public static int calculateHandshakes(int numberOfStudents) {
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        return handshakes;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int numberOfStudents = input.nextInt();

        int handshakes = calculateHandshakes(numberOfStudents);

        System.out.println("Maximum Handshakes = " + handshakes);

        input.close();
    }
}