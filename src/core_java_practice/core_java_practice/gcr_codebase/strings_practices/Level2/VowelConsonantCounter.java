package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level2;

import java.util.Scanner;

public class VowelConsonantCounter {

    public static String checkCharacter(char character) {

        character = Character.toLowerCase(character);

        if (character == 'a'
                || character == 'e'
                || character == 'i'
                || character == 'o'
                || character == 'u') {

            return "Vowel";
        }

        if (character >= 'a'
                && character <= 'z') {

            return "Consonant";
        }

        return "Not a Letter";
    }

    public static int[] countVowelsConsonants(String text) {

        int vowelCount = 0;
        int consonantCount = 0;

        for (int index = 0; index < text.length(); index++) {

            String result =
                    checkCharacter(text.charAt(index));

            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = scanner.nextLine();

        int[] counts =
                countVowelsConsonants(text);

        System.out.println("Vowels = "
                + counts[0]);

        System.out.println("Consonants = "
                + counts[1]);
    }
}
