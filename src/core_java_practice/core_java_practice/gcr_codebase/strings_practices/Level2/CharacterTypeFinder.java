package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level2;

import java.util.Scanner;

public class CharacterTypeFinder {

    // Method to check character type
    public static String checkCharacterType(char character) {

        if (character >= 'A' && character <= 'Z') {
            character = (char) (character + 32);
        }

        if (character == 'a' || character == 'e' ||
                character == 'i' || character == 'o' ||
                character == 'u') {
            return "Vowel";
        }

        if (character >= 'a' && character <= 'z') {
            return "Consonant";
        }

        return "Not a Letter";
    }

    // Method to create 2D array
    public static String[][] getCharacterDetails(String text) {

        String[][] result = new String[text.length()][2];

        for (int index = 0; index < text.length(); index++) {

            result[index][0] = String.valueOf(text.charAt(index));
            result[index][1] = checkCharacterType(text.charAt(index));
        }

        return result;
    }

    // Display method
    public static void displayTable(String[][] data) {

        System.out.println("Character\tType");

        for (int index = 0; index < data.length; index++) {

            System.out.println(data[index][0] + "\t\t" + data[index][1]);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = scanner.nextLine();

        String[][] result = getCharacterDetails(text);

        displayTable(result);
    }
}
