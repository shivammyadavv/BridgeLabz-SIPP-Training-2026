package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level3;

import java.util.Scanner;

public class CharacterFrequency {

    // Find frequencies
    public static String[][] findFrequency(
            String text) {

        int[] frequencyArray =
                new int[256];

        for (int index = 0;
             index < text.length();
             index++) {

            frequencyArray[
                    text.charAt(index)]++;
        }

        int uniqueCount = 0;

        for (int index = 0;
             index < 256;
             index++) {

            if (frequencyArray[index] > 0) {
                uniqueCount++;
            }
        }

        String[][] result =
                new String[uniqueCount][2];

        int row = 0;

        for (int index = 0;
             index < 256;
             index++) {

            if (frequencyArray[index] > 0) {

                result[row][0] =
                        String.valueOf((char) index);

                result[row][1] =
                        String.valueOf(
                                frequencyArray[index]);

                row++;
            }
        }

        return result;
    }

    public static void displayResult(
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
                findFrequency(text);

        displayResult(result);
    }
}
