package core_java_practice.core_java_practice.gcr_codebase.recursion.recursion_practice;

public class ReverseStringRecursion {

    public static String reverseString(String text) {
        if (text.length() <= 1) {
            return text;
        }

        return reverseString(text.substring(1)) + text.charAt(0);
    }

    public static void main(String[] args) {
        String text = "hello";

        String reversedText = reverseString(text);

        System.out.println(reversedText);
    }
}
