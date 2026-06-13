package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level3;

import java.util.Scanner;

public class FrequencyUsingUniqueCharacters {

    // Find unique characters
    public static char[] uniqueCharacters(
            String text) {

        char[] tempArray =
                new char[text.length()];

        int uniqueCount = 0;

        for (int outer = 0;
             outer < text.length();
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

                tempArray[uniqueCount] =
                        text.charAt(outer);

                uniqueCount++;
            }
        }

        char[] uniqueArray =
                new char[uniqueCount];

        for (int index = 0;
             index < uniqueCount;
             index++) {

            uniqueArray[index] =
                    tempArray[index];
        }

        return uniqueArray;
    }

    // Find frequency table
    public static String[][] getFrequencyTable(
            String text) {

        char[] uniqueArray =
                uniqueCharacters(text);

        String[][] result =
                new String[uniqueArray.length][2];

        for (int index = 0;
             index < uniqueArray.length;
             index++) {

            int count = 0;

            for (int inner = 0;
                 inner < text.length();
                 inner++) {

                if (uniqueArray[index]
                        == text.charAt(inner)) {

                    count++;
                }
            }

            result[index][0] =
                    String.valueOf(
                            uniqueArray[index]);

            result[index][1] =
                    String.valueOf(count);
        }

        return result;
    }

    // Display frequency table
    public static void displayTable(
            String[][] result) {

        System.out.println(
                "\nCharacter\tFrequency");

        for (int row = 0;
             row < result.length;
             row++) {

            System.out.println(
                    result[row][0]
                            + "\t\t"
                            + result[row][1]);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = scanner.nextLine();

        String[][] result =
                getFrequencyTable(text);

        displayTable(result);
    }
}
