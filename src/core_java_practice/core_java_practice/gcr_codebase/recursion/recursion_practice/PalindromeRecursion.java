package core_java_practice.core_java_practice.gcr_codebase.recursion.recursion_practice;

public class PalindromeRecursion {

    public static boolean isPalindrome(String text, int startIndex, int endIndex) {

        if (startIndex >= endIndex) {
            return true;
        }

        if (text.charAt(startIndex) != text.charAt(endIndex)) {
            return false;
        }

        return isPalindrome(text, startIndex + 1, endIndex - 1);
    }

    public static void main(String[] args) {
        String text = "madam";

        boolean palindrome = isPalindrome(text, 0, text.length() - 1);

        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
