package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level1;

import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    public static void generateException(String text) {

        System.out.println(text.substring(5, 2));
    }

    public static void handleException(String text) {

        try {

            System.out.println(text.substring(5, 2));

        } catch (IllegalArgumentException exception) {

            System.out.println("IllegalArgumentException Handled");

        } catch (RuntimeException exception) {

            System.out.println("Runtime Exception Handled");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = scanner.next();

        // generateException(text);

        handleException(text);
    }
}