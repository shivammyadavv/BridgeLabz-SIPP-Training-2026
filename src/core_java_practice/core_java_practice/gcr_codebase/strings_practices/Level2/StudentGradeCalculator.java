package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level2;

import java.util.Scanner;

public class StudentGradeCalculator {

    // Generate marks
    public static int[][] getMarks(int totalStudents,
                                   Scanner scanner) {

        int[][] marks =
                new int[totalStudents][3];

        for (int student = 0;
             student < marks.length;
             student++) {

            System.out.println("\nStudent "
                    + (student + 1));

            System.out.print("Physics: ");
            marks[student][0] =
                    scanner.nextInt();

            System.out.print("Chemistry: ");
            marks[student][1] =
                    scanner.nextInt();

            System.out.print("Maths: ");
            marks[student][2] =
                    scanner.nextInt();
        }

        return marks;
    }

    // Calculate grade
    public static String getGrade(double percentage) {

        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        }

        return "F";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int totalStudents = scanner.nextInt();

        int[][] marks =
                getMarks(totalStudents, scanner);

        System.out.println(
                "\nPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int student = 0;
             student < marks.length;
             student++) {

            int total =
                    marks[student][0]
                            + marks[student][1]
                            + marks[student][2];

            double average = total / 3.0;

            double percentage =
                    Math.round((total / 300.0)
                            * 10000) / 100.0;

            String grade =
                    getGrade(percentage);

            System.out.println(
                    marks[student][0] + "\t"
                            + marks[student][1] + "\t"
                            + marks[student][2] + "\t"
                            + total + "\t"
                            + average + "\t"
                            + percentage + "\t"
                            + grade);
        }
    }
}
