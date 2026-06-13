package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level3;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Find first non-repeating character
    public static char findFirstNonRepeating(
            String text) {

        int[] frequencyArray =
                new int[256];

        for (int index = 0;
             index < text.length();
             index++) {

            frequencyArray[
                    text.charAt(index)]++;
        }

        for (int index = 0;
             index < text.length();
             index++) {

            if (frequencyArray[
                    text.charAt(index)] == 1) {

                return text.charAt(index);
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = scanner.nextLine();

        char result =
                findFirstNonRepeating(text);

        if (result != '\0') {

            System.out.println(
                    "First Non-Repeating Character: "
                            + result);

        } else {

            System.out.println(
                    "No Non-Repeating Character Found");
        }
    }
}
