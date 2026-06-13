package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level3;

import java.util.Scanner;

public class CharacterFrequencyNestedLoop {

    public static String[] findCharacterFrequency(String text) {

        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length];

        for (int i = 0; i < characters.length; i++) {

            frequency[i] = 1;

            if (characters[i] == '0') {
                continue;
            }

            for (int j = i + 1; j < characters.length; j++) {

                if (characters[i] == characters[j]) {

                    frequency[i]++;
                    characters[j] = '0';
                }
            }
        }

        String[] result = new String[characters.length];

        for (int i = 0; i < characters.length; i++) {

            if (characters[i] != '0') {

                result[i] = characters[i] + " : "
                        + frequency[i];
            }
        }

        return result;
    }

    public static void displayResult(String[] result) {

        System.out.println("Character Frequencies:");

        for (int i = 0; i < result.length; i++) {

            if (result[i] != null) {
                System.out.println(result[i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = scanner.nextLine();

        String[] result =
                findCharacterFrequency(text);

        displayResult(result);
    }
}
