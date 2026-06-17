package core_java_practice.core_java_practice.gcr_codebase.recursion.recursion_practice;

public class StringPermutations {

    public static void generatePermutations(
            String text,
            String currentPermutation) {

        if (text.isEmpty()) {
            System.out.println(currentPermutation);
            return;
        }

        for (int index = 0; index < text.length(); index++) {

            char currentCharacter = text.charAt(index);

            String remainingText =
                    text.substring(0, index)
                            + text.substring(index + 1);

            generatePermutations(
                    remainingText,
                    currentPermutation + currentCharacter);
        }
    }

    public static void main(String[] args) {
        String text = "ABC";

        generatePermutations(text, "");
    }
}
