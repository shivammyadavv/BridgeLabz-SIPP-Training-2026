package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level1;

import java.util.Scanner;

public class StringComparison {

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String firstText, String secondText) {

        if (firstText.length() != secondText.length()) {
            return false;
        }

        for (int index = 0; index < firstText.length(); index++) {
            if (firstText.charAt(index) != secondText.charAt(index)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String firstText = scanner.next();

        System.out.print("Enter Second String: ");
        String secondText = scanner.next();

        boolean customResult = compareStrings(firstText, secondText);
        boolean builtInResult = firstText.equals(secondText);

        System.out.println("Custom Comparison Result : " + customResult);
        System.out.println("Built-in Comparison Result : " + builtInResult);
    }
}
