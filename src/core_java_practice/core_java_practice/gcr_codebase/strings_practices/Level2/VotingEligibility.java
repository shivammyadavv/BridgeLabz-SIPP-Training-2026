package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level2;

import java.util.Scanner;

public class VotingEligibility {

    // Input ages
    public static int[] getStudentAges(int totalStudents,
                                       Scanner scanner) {

        int[] ages = new int[totalStudents];

        for (int index = 0; index < ages.length; index++) {

            System.out.print("Enter Age of Student "
                    + (index + 1) + ": ");

            ages[index] = scanner.nextInt();
        }

        return ages;
    }

    // Check voting eligibility
    public static String[][] getVotingStatus(int[] ages) {

        String[][] result =
                new String[ages.length][2];

        for (int index = 0; index < ages.length; index++) {

            result[index][0] =
                    String.valueOf(ages[index]);

            if (ages[index] >= 18) {
                result[index][1] = "Can Vote";
            } else {
                result[index][1] = "Cannot Vote";
            }
        }

        return result;
    }

    // Display result
    public static void displayResult(String[][] result) {

        System.out.println("Age\tStatus");

        for (int index = 0; index < result.length; index++) {

            System.out.println(result[index][0]
                    + "\t"
                    + result[index][1]);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalStudents = 10;

        int[] ages = getStudentAges(totalStudents,
                scanner);

        String[][] result =
                getVotingStatus(ages);

        displayResult(result);
    }
}
