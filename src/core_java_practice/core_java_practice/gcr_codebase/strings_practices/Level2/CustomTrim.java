package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level2;

import java.util.Scanner;

public class CustomTrim {

    // Find start and end indexes
    public static int[] findTrimIndexes(String text) {

        int startIndex = 0;
        int endIndex = text.length() - 1;

        while (text.charAt(startIndex) == ' ') {
            startIndex++;
        }

        while (text.charAt(endIndex) == ' ') {
            endIndex--;
        }

        return new int[]{startIndex, endIndex};
    }

    // Create substring using charAt
    public static String createSubstring(String text,
                                         int startIndex,
                                         int endIndex) {

        String result = "";

        for (int index = startIndex;
             index <= endIndex;
             index++) {

            result += text.charAt(index);
        }

        return result;
    }

    // Compare strings
    public static boolean compareStrings(String first,
                                         String second) {

        if (first.length() != second.length()) {
            return false;
        }

        for (int index = 0; index < first.length(); index++) {

            if (first.charAt(index) != second.charAt(index)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = scanner.nextLine();

        int[] indexes = findTrimIndexes(text);

        String customTrim =
                createSubstring(text,
                        indexes[0],
                        indexes[1]);

        String builtInTrim = text.trim();

        System.out.println("Custom Trim : " + customTrim);
        System.out.println("Built-in Trim : " + builtInTrim);

        System.out.println("Equal : "
                + compareStrings(customTrim, builtInTrim));
    }
}
