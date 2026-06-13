package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level3;

import java.util.Scanner;

public class UniqueCharactersFinder {

    // Find length without length()
    public static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception exception) {
            return count;
        }
    }

    // Find unique characters
    public static char[] findUniqueCharacters(String text) {

        int textLength = findLength(text);

        char[] temporaryArray =
                new char[textLength];

        int uniqueCount = 0;

        for (int outer = 0;
             outer < textLength;
             outer++) {

            boolean isUnique = true;

            for (int inner = 0;
                 inner < outer;
                 inner++) {

                if (text.charAt(outer)
                        == text.charAt(inner)) {

                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {

                temporaryArray[uniqueCount] =
                        text.charAt(outer);

                uniqueCount++;
            }
        }

        char[] uniqueCharacters =
                new char[uniqueCount];

        for (int index = 0;
             index < uniqueCount;
             index++) {

            uniqueCharacters[index] =
                    temporaryArray[index];
        }

        return uniqueCharacters;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = scanner.nextLine();

        char[] uniqueCharacters =
                findUniqueCharacters(text);

        System.out.println("Unique Characters:");

        for (int index = 0;
             index < uniqueCharacters.length;
             index++) {

            System.out.print(
                    uniqueCharacters[index] + " ");
        }
    }
}