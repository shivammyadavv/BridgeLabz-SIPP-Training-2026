package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level3;

import java.util.Scanner;

public class AnagramChecker {

    public static boolean checkAnagram(
            String firstText,
            String secondText) {

        if (firstText.length()
                != secondText.length()) {

            return false;
        }

        int[] frequency =
                new int[256];

        for (int index = 0;
             index < firstText.length();
             index++) {

            frequency[
                    firstText.charAt(index)]++;

            frequency[
                    secondText.charAt(index)]--;
        }

        for (int index = 0;
             index < frequency.length;
             index++) {

            if (frequency[index] != 0) {

                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Text: ");
        String firstText = scanner.nextLine();

        System.out.print("Enter Second Text: ");
        String secondText = scanner.nextLine();

        boolean result =
                checkAnagram(
                        firstText,
                        secondText);

        System.out.println(
                "Are Anagrams: "
                        + result);
    }
}