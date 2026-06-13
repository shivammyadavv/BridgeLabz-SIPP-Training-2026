package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level2;

import java.util.Scanner;

public class WordLengthTable {

    public static String[] splitText(String text) {
        return text.split(" ");
    }

    public static String[][] createWordLengthTable(String[] words) {

        String[][] result = new String[words.length][2];

        for (int index = 0; index < words.length; index++) {

            result[index][0] = words[index];
            result[index][1] = String.valueOf(words[index].length());
        }

        return result;
    }

    public static void displayTable(String[][] data) {

        System.out.println("Word\tLength");

        for (int index = 0; index < data.length; index++) {

            System.out.println(data[index][0]
                    + "\t"
                    + Integer.parseInt(data[index][1]));
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = scanner.nextLine();

        String[] words = splitText(text);

        String[][] result = createWordLengthTable(words);

        displayTable(result);
    }
}

