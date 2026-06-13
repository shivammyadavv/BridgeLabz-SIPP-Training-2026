package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level1;

import java.util.Scanner;

public class SubStringGenerator {

    // Method to create substring using charAt()
    public static String createSubstring(String text, int startIndex, int endIndex) {

        String result = "";

        for (int index = startIndex; index < endIndex; index++) {
            result += text.charAt(index);
        }

        return result;
    }

    // Method to compare strings
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

        System.out.print("Enter Text: ");
        String text = scanner.next();

        System.out.print("Enter Start Index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter End Index: ");
        int endIndex = scanner.nextInt();

        String customSubstring = createSubstring(text, startIndex, endIndex);
        String builtInSubstring = text.substring(startIndex, endIndex);

        boolean isSame = compareStrings(customSubstring, builtInSubstring);

        System.out.println("Custom Substring : " + customSubstring);
        System.out.println("Built-in Substring : " + builtInSubstring);
        System.out.println("Comparison Result : " + isSame);
    }
}
