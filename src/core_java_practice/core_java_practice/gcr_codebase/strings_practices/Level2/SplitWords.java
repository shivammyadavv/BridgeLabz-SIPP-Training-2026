package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level2;

import java.util.Scanner;

public class SplitWords {

    public static String[] splitText(String text) {

        int wordCount = 1;

        for (int index = 0; index < text.length(); index++) {
            if (text.charAt(index) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int start = 0;
        int wordIndex = 0;

        for (int index = 0; index <= text.length(); index++) {

            if (index == text.length() || text.charAt(index) == ' ') {

                words[wordIndex] = text.substring(start, index);
                wordIndex++;
                start = index + 1;
            }
        }

        return words;
    }

    public static boolean compareArrays(String[] first, String[] second) {

        if (first.length != second.length) {
            return false;
        }

        for (int index = 0; index < first.length; index++) {
            if (!first[index].equals(second[index])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = scanner.nextLine();

        String[] customWords = splitText(text);
        String[] builtInWords = text.split(" ");

        System.out.println("Arrays Equal : "
                + compareArrays(customWords, builtInWords));
    }
}
