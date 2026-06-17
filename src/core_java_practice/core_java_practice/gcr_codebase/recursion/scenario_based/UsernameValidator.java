package core_java_practice.core_java_practice.gcr_codebase.recursion.scenario_based;

public class UsernameValidator {

    public static boolean isValidUsername(
            String username,
            int currentIndex) {

        // Base Case
        if (currentIndex == username.length()) {
            return true;
        }

        char currentCharacter =
                username.charAt(currentIndex);

        // Check if lowercase letter
        if (currentCharacter < 'a'
                || currentCharacter > 'z') {
            return false;
        }

        // Recursive Call
        return isValidUsername(
                username,
                currentIndex + 1);
    }

    public static void main(String[] args) {

        String username = "abcdxyz";

        boolean result =
                isValidUsername(username, 0);

        System.out.println(result);
    }
}
