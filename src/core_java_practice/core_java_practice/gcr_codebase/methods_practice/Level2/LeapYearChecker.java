package core_java_practice.core_java_practice.gcr_codebase.methods_practice.Level2;

import java.util.Scanner;

public class LeapYearChecker {

    public static boolean isLeapYear(int year) {

        if (year < 1582) {
            return false;
        }

        if ((year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Year: ");
        int year = input.nextInt();

        if (year < 1582) {
            System.out.println(
                    "Year should be 1582 or later");
        } else {

            boolean leapYear =
                    isLeapYear(year);

            if (leapYear) {
                System.out.println(
                        year + " is a Leap Year");
            } else {
                System.out.println(
                        year + " is Not a Leap Year");
            }
        }

        input.close();
    }
}
