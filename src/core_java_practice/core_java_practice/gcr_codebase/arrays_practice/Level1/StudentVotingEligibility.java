package core_java_practice.core_java_practice.gcr_codebase.arrays_practice.Level1;

import java.util.Scanner;

public class StudentVotingEligibility {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare array for 10 students
        int[] studentAges = new int[10];

        // Take input
        for (int index = 0; index < studentAges.length; index++) {
            System.out.print("Enter age of student " + (index + 1) + ": ");
            studentAges[index] = input.nextInt();
        }

        // Check voting eligibility
        for (int age : studentAges) {

            if (age < 0) {
                System.out.println("Invalid Age: " + age);
            }
            else if (age >= 18) {
                System.out.println("The student with age " + age + " can vote.");
            }
            else {
                System.out.println("The student with age " + age + " cannot vote.");
            }
        }

        input.close();
    }
}
