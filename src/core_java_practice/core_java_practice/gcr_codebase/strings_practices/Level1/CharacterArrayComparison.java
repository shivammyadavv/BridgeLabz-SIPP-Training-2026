package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level1;

import java.util.Scanner;

public class CharacterArrayComparison {

    // Method to convert string into char array
    public static char[] getCharacters(String text) {

        char[] characterArray = new char[text.length()];

        for (int index = 0; index < text.length(); index++) {
            characterArray[index] = text.charAt(index);
        }

        return characterArray;
    }

    // Method to compare two char arrays
    public static boolean compareArrays(char[] firstArray, char[] secondArray) {

        if (firstArray.length != secondArray.length) {
            return false;
        }

        for (int index = 0; index < firstArray.length; index++) {
            if (firstArray[index] != secondArray[index]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = scanner.next();

        char[] customArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();

        boolean result = compareArrays(customArray, builtInArray);

        System.out.println("Arrays Are Equal : " + result);
    }
}
