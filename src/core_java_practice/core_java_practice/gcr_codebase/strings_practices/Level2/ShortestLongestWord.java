package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level2;

import java.util.Scanner;

public class ShortestLongestWord {

    public static String[] splitText(String text) {
        return text.split(" ");
    }

    public static int[] findShortestLongest(String[] words) {

        int shortestIndex = 0;
        int longestIndex = 0;

        for (int index = 1; index < words.length; index++) {

            if (words[index].length()
                    < words[shortestIndex].length()) {

                shortestIndex = index;
            }

            if (words[index].length()
                    > words[longestIndex].length()) {

                longestIndex = index;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = scanner.nextLine();

        String[] words = splitText(text);

        int[] indexes = findShortestLongest(words);

        System.out.println("Shortest Word : "
                + words[indexes[0]]);

        System.out.println("Longest Word : "
                + words[indexes[1]]);
    }
}
