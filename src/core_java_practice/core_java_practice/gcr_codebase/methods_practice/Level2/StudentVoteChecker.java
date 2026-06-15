package core_java_practice.core_java_practice.gcr_codebase.methods_practice.Level2;

import java.util.Scanner;

public class StudentVoteChecker {

    public static boolean canStudentVote(int age) {

        if (age < 0) {
            return false;
        }

        return age >= 18;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int totalStudents = 10;

        int[] studentAges =
                new int[totalStudents];

        for (int index = 0;
             index < studentAges.length;
             index++) {

            System.out.print(
                    "Enter Age of Student "
                            + (index + 1) + ": ");

            studentAges[index] =
                    input.nextInt();
        }

        System.out.println("\nVoting Eligibility");

        for (int index = 0;
             index < studentAges.length;
             index++) {

            boolean canVote =
                    canStudentVote(
                            studentAges[index]);

            System.out.println(
                    "Student "
                            + (index + 1)
                            + " : "
                            + canVote);
        }

        input.close();
    }
}
