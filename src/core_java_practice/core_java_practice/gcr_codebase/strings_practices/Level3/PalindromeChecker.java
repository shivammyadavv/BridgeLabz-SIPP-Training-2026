package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level3;

import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1
    public static boolean isPalindrome(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            if (text.charAt(start)
                    != text.charAt(end)) {

                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    // Logic 2 Recursive
    public static boolean isPalindromeRecursive(
            String text,
            int start,
            int end) {

        if (start >= end) {
            return true;
        }

        if (text.charAt(start)
                != text.charAt(end)) {

            return false;
        }

        return isPalindromeRecursive(
                text,
                start + 1,
                end - 1);
    }

    // Reverse String
    public static char[] reverseString(
            String text) {

        char[] reverse =
                new char[text.length()];

        int position = 0;

        for (int index = text.length() - 1;
             index >= 0;
             index--) {

            reverse[position] =
                    text.charAt(index);

            position++;
        }

        return reverse;
    }

    // Logic 3
    public static boolean isPalindromeArray(
            String text) {

        char[] original =
                text.toCharArray();

        char[] reverse =
                reverseString(text);

        for (int index = 0;
             index < original.length;
             index++) {

            if (original[index]
                    != reverse[index]) {

                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = scanner.nextLine();

        System.out.println(
                "Logic 1 Result: "
                        + isPalindrome(text));

        System.out.println(
                "Logic 2 Result: "
                        + isPalindromeRecursive(
                        text,
                        0,
                        text.length() - 1));

        System.out.println(
                "Logic 3 Result: "
                        + isPalindromeArray(text));
    }
}
